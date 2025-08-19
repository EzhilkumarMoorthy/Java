

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;



  

public class ImportExcel 
{

	public boolean doProcess(String path,String tableName,String skipCreateTable,Connection connection)throws Exception
	{
		File file=new File(path);
		FileOutputStream fos=new FileOutputStream("D:\\ImportXLS\\"+tableName+".sql");
		PrintWriter pw=new PrintWriter(fos);
		Sheet sheet=null;
		int no_of_columns=0;
		int no_of_rows=0;
		Cell colCell=null;
		Cell rowCell=null;
		Cell DataTypeCell=null;
		StringBuffer column_names_with_type = new StringBuffer();
		StringBuffer column_names = new StringBuffer();
		StringBuffer create_table = new StringBuffer();
		String sql=null;
		boolean isSkipCreateTable = false;
		if(skipCreateTable.trim().equalsIgnoreCase("true"))
		{
			isSkipCreateTable = true;
		}
    	HashMap dataTypeHash = new HashMap();
    	
		try 
		{
			Logger.log(null,"ImportExcel", "Hello!!", "", Logger.INFO, Logger.LOG_COMMON);
			Workbook workbook=Workbook.getWorkbook(file);
			sheet=workbook.getSheet(2);
			no_of_columns=sheet.getColumns();
			no_of_rows=sheet.getRows();
			//Dynamic query to create the table - started  
			for(int i=0;i<no_of_columns;i++)
			{
				colCell=sheet.getCell(i,0);
				DataTypeCell=sheet.getCell(i,1);
				if(!colCell.getContents().equals(""))
				{
					column_names_with_type.append(colCell.getContents());
					column_names.append(colCell.getContents());
					column_names_with_type.append(" ");
					column_names_with_type.append(DataTypeCell.getContents());
					dataTypeHash.put(i, DataTypeCell.getContents());
					if(i!=no_of_columns-1)
					{
						column_names_with_type.append(",");
						column_names.append(",");
					}
				}
				
			}
			
			create_table.append("CREATE TABLE "+tableName);
			create_table.append(" ("+column_names_with_type+")");
			pw.println(create_table+";");
			Logger.log(null,"ImportExcel","create_table13:: "+create_table, "", Logger.INFO, Logger.LOG_COMMON);
			Logger.log(null,"ImportExcel","no_of_columns :: "+no_of_columns+ " no_of_rows :: "+no_of_rows, "", Logger.INFO, Logger.LOG_COMMON);
			if(!isSkipCreateTable)
			{
				GenericFactory.executeUpdateSQL(create_table.toString(),connection);
			}
			String type="";
			//Dynamic query to create the table - ended
			
			//Dynamic query to insert the data - started
			for(int i=2;i<no_of_rows;i++)
			{
				sql ="INSERT INTO "+tableName+" ("+column_names+")VALUES(";
				for(int j=0;j<no_of_columns;j++)
				{
					type=(String)dataTypeHash.get(j);
					type=type.toUpperCase();
					rowCell=sheet.getCell(j,i);
					String content=rowCell.getContents();
					content=content.replace("'", "''");
					//Logger.log(null,"ImportExcel","content::"+content, "", Logger.INFO, Logger.LOG_COMMON);
					if(type.contains("VARCHAR"))
					{
						if(content.trim().length()==0)
						{
							content=" ";
						}
						sql+="'"+content+"'"; 
						
					}
					else if(type.contains("NUMBER")||type.contains("DECIMAL")||type.contains("NUMERIC"))
					{
						if(content.trim().length()==0)
						{
							content="0";
						}
						sql+=""+content+"";
					}
					if(j!=no_of_columns-1)
					{
						sql+=",";
					}
				}
				sql+=")";
				pw.println(sql+";");
				//Logger.log(null,"ImportExcel","sql::"+sql, "", Logger.INFO, Logger.LOG_COMMON);
				GenericFactory.executeUpdateSQL(sql.toString(),connection);
			}
			//Dynamic query to insert the data - ended
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			Logger.log(null,"ImportExcel", "Exception in doProcess :: "+e, Logger.ERROR, Logger.LOG_COMMON);
		}
		pw.close();
		fos.close();
		return true;
	}

	public static void main(String[] args) throws SQLException 
	{
		
		if(args == null || args.length <3)
		{
			Logger.log(null,"ImportExcel", "Exception::Invalid Arguments ", "", Logger.INFO, Logger.LOG_COMMON);				
			return ;
		}
		String userid		= args[0];
		String table 		= args[1];
		String path 		= args[2];
		String skipCreateTable = "";
		
		if(args == null && args.length == 4)
		{
			skipCreateTable = args[3];
		}
		
		Logger.log(null,"ImportExcel", "User:: "+userid+" Table Name::"+table+" File path::"+path , "", Logger.INFO, Logger.LOG_COMMON);
		
		Connection conn				= null;
		try
		{
			DbManager.setWebMode(false);
			conn = DbManager.getConnection();
			ImportExcel ImportExcel = new ImportExcel();
			boolean result = ImportExcel.doProcess(path,table,skipCreateTable,conn);
			conn.commit();
		}
		catch(Exception e)
		{
			Logger.log(null,"ImportExcel", "Exception:: "+e, "", Logger.INFO, Logger.LOG_COMMON);
			conn.rollback();
		}
		finally 
		{
			if(conn!=null && !conn.isClosed())
				conn.close();
			System.exit(0);
		}
	}

}
