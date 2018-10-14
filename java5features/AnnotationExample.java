package java5features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class AnnotationExample {

	
	/**
	 * @param args
	 * Annotation is a tag to represents meta data of class/interfaces/enum.
	 * 
	 *  1) There are two types of Annotation 
	 *     * Built in Annotation - @Deprecated,@SuppressWarnings,@Override  
	 *     * Custom Annotation
	 *     
	 * 
	 */
	
	public class Animal
	{
		public void run()
		{
			System.out.println("Animal can run");
		}
	}
	
	public class Chetta extends Animal
	{
		
		@Override
		public void run() // Compile time error will occur if you does not overriding super class method.
		{
			System.out.println("Chetta can run faster than any other animal");
		}
		
		@Deprecated
		public void deprecateMethod() // This denotes that, methods can be removed in future or better implementation made in some other method. 
		{
			
		}
		
		
		public void getList() 
		{
			List list = new ArrayList();
			Collections.sort(list);
		}
	}
	public static void main(String[] args) {

	}
}