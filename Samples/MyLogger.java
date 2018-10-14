import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;


public class MyLogger 
{
	private void writeLog()throws Exception
	{
		Logger logger =  Logger.getLogger(MyLogger.class.getName());
		DailyRollingFileAppender dailyRollingFileAppender = (DailyRollingFileAppender)Class.forName("org.apache.log4j.DailyRollingFileAppender").newInstance();
		PatternLayout 			 patternLayout 			  = (PatternLayout) Class.forName("org.apache.log4j.PatternLayout").newInstance();
		
		patternLayout.setConversionPattern("%d{MM/dd/yyyy hh:mm:ss} [%p] [%C{1}] - %m%n");
		
		String fileName = "D:\\BevSource\\MyProject\\TempFiles\\MyLogger" + ".log";
		
        dailyRollingFileAppender.setLayout(patternLayout);
        dailyRollingFileAppender.setFile(fileName); 
        dailyRollingFileAppender.activateOptions();
        logger.addAppender(dailyRollingFileAppender);
        
		logger.info("This is my first logger example info"); 
		logger.warn("This is my first logger example warn");
		logger.error("This is my first logger example error");
		logger.debug("This is my first logger example debug");
		logger.fatal("This is my first logger example fatal");
		
	}
	public static void main(String[] args) 
	{
		MyLogger myLogger = new MyLogger();
		try
		{
			myLogger.writeLog();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.exit(0);
	}

}
