package java5features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ForEachLoopExample {

	/**
	 * @param args
	 * This is mainly used for traversing a collection / array. It will increase the readability of program and reduces the program bug.  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arrList = new ArrayList<String>();

		arrList.add("Vairavel");
		arrList.add("Leo");
		arrList.add("Ezhil");
		arrList.add("Dhanapal");
		
		for(String str : arrList)
		{
			System.out.println(str);
		}
		
		Collections.sort(arrList);
		
		System.out.println("\nAfter Sorting..\n");
		
		for(String str : arrList)
		{
			System.out.println(str);
		}
	}

}

