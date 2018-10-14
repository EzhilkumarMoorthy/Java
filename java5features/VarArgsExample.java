package java5features;

public class VarArgsExample {

	/**
	 * @param args
	 * This can allow one or more values as an argument. Before introduction of varargs, Overloading / array has been used for passing 
	 * multiple arguments in a method.
	 * 
	 *  Rules
	 *  1) This can allow only one varargs in a argument
	 *  2) Variable argument(varargs) must be the last argument
	 */
	
	public void calculateTotal(String str,int... values)
	{
		int total = 0;
		
		
		System.out.println("Total is - "+total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgsExample varArgs = new VarArgsExample();
		varArgs.calculateTotal("",1,2);
		varArgs.calculateTotal("",1,2,3);
		varArgs.calculateTotal("",1,2,3,4,5,6);
		
	}

}
