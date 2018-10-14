package java7features;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TryWithResourceExample {

	/*
	 * Try with resource statement is a try statement to declare one or more resources. The resources is object that can be closed after finishing the program.
	 * 
	 * 1. The resource may File I/O class such as FileInputStream,FileOutPutStream, etc.,
	 * 2. catch and finally block executes after closing of declared resources.
	 * 3.  
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try( FileInputStream fos = new FileInputStream("C:/inputFile.txt");
			 FileOutputStream fop = new FileOutputStream(new File("C:/inputFile.txt"));
			)
		{
			
		}
		catch(Exception e)
		{
			
		}
	

	}

}
