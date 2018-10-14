package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

//This is functional interface as its having only one Abstract method
interface Drawable
{
	void draw();
}

public class LambadaExpression {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Ezhil");
		list.add("Albin");
		list.add("Kumar");
		list.add("Babu");
		
		//Collections.sort(list); 
		
		for(String s : list)
			System.out.println(s);
		
		// Without lambada to implement Functional Interface 
		Drawable d1 = new Drawable()
		{
			public void draw() {
				System.out.println("Without lambada to implement Functional Interface ");
			}
		};
		
		// With lambada expression to implement Functional Interface
		Drawable d2 = ()->{
			System.out.println("With lambada expression to implement Functional Interface "); 
			}; 
	}

}
