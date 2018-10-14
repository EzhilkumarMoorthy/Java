import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties extends Properties 
{

    public static final String  DB_DRIVER_TYPE                = "db.driverType";
    public static final String  DB_DRIVER_PARAM               = "db.driverParameters";
    public static final String  DB_TYPE                       = "db.type";
    public static final String  DB_USER                       = "db.user";
    public static final String  DB_PASSWORD                   = "db.password";
    public static final String  DB_DRIVER                     = "db.driver";
    public static final String  DEFAULT_PROP_FILENAME         = "D:\\BevSource\\MyProject\\TempFiles\\elite.properties"; 
    
    public void readProperties() throws Exception
    {
    	 try
         {
    		 System.out.println("DEFAULT_PROP_FILENAME()::"+DEFAULT_PROP_FILENAME); 
			 FileInputStream propFile = new FileInputStream(DEFAULT_PROP_FILENAME);
			 load(propFile);
    		 System.out.println("getDB_DRIVER_TYPE()::"+getDB_DRIVER_TYPE());
    		 System.out.println("getDB_DRIVER_PARAM()::"+getDB_DRIVER_PARAM());
    		 System.out.println("getDB_TYPE()::"+getDB_TYPE());
    		 System.out.println("getDB_USER()::"+getDB_USER());
    		 System.out.println("getDB_PASSWORD()::"+getDB_PASSWORD());
    		 System.out.println("getDB_DRIVER()::"+getDB_DRIVER());
         }
         catch (Exception e)
         {
			 System.out.println("EXCEPTION()::"+e);
			 throw e;

         }
    }
	public static void main(String[] args)  throws Exception
	{
    	ReadProperties props=new ReadProperties();
    	props.readProperties();
	}
	
	public String getDB_DRIVER_TYPE() 
	{
		return getProperty(DB_DRIVER_TYPE,"");
	}
	public String getDB_DRIVER_PARAM() 
	{
		return getProperty(DB_DRIVER_PARAM,"");
	}
	public  String getDB_TYPE() 
	{
		return getProperty(DB_TYPE,"");
	}
	public String getDB_USER()
	{
		return getProperty(DB_USER,"");
	}
	public String getDB_PASSWORD() 
	{
		return getProperty(DB_PASSWORD);
	}
	public String getDB_DRIVER() 
	{
		return getProperty(DB_DRIVER,"");
	}

}
