package java7features;

/*
 * 1. Allow to catch multiple exception in a single catch itself. Pipe (|) separator is used for separating the multiple exceptions.
 * 2. It makes the catch parameter (e) as final and so it can't be modified.
 * 3. Follow the rule of generalized to more specialized when catching multiple exceptions.
 *    If you are using super(general) class don't use child(special) class in catch.
 * */
public class MutipleCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a = 10 / 0;
		}
		catch(Exception  e)
		{
			e.getMessage();
		}

	}

}
