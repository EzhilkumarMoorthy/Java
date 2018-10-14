package java5features;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	/**
	 * @param args
	 * Which ensures the type safety. Before introduction of generic, we can store any type of objects in a collection. (i.e A collection 
	 * can have Integer Object as well String Object.* )  
	 * 
	 * 1) Type Safe
	 * 2) Type casting is not required
	 * 3) Compile time checking, so error will not occur at run time. 
	 * 4) Generic used in collection, best example is comparable interface
	 * 
	 * Type Parameters
	 * T - Type
	 * E - Element
	 * K - Key
	 * V - Value
	 * N - Number
	 */
	
	class Animal<T>
	{
		T obj;

		public T getObj() {
			return obj;
		}

		public void setObj(T obj) {
			this.obj = obj;
		}
	}
	
	public static void main(String[] args) {
		
		List <String> list = new ArrayList<String>();
		list.add("Ezhil");
		//list.add(1); //Type safe & Compile time checking
		
		String str = list.get(0); // Type casting is not required, non-generic classes will throw ClassCastException
		
	}

}
