package java7features;

/*
 * 1. It must be only string object
 * 2. String object is case sensitive
 * 3. String object can not be null. If string object is null it will cause null pointer exception.
 * */
public class SwitchWithStringExample {

	public static void main(String[] args) {

		String str = "hello";
		
		switch(str)
		{
			case "hello" : {System.out.println("hello"); break;}
			case "Hello" : {System.out.println("Hello"); break;}
		}
	}

}
