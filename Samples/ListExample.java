package CollectionExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListExample {

	public static void main(String args[])
	{
		List list1 = new LinkedList();
		List list2 = new ArrayList();
		
		
		if(list1.isEmpty())
		{
			list1.add("Ezhil");
			list1.add("Ariv");
			list1.add("Dhana");
			list1.add("Leo");
		}
		
		if(list2.isEmpty())
		{
			list2.add("Ezhil");
			list2.add("Ariv");
			list2.add("Dhana");
			list2.add("Leo");
			//list2.add("Leo1");
		}
			
		System.out.println("List Size is " + list1.size());
		
		if(list1.equals(list2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		/*for(Object str : list1)
		{
			System.out.println(str);
		}*/
		
		/*Iterator iter = list1.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		*/
		
		
		for(int i=0; i < list1.size(); i++)
		{
			System.out.println(list1.get(i));
		}
		
	}
}
