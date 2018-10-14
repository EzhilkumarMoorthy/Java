package java5features;

public class AutoBoxingExample {

	/**
	 * @param args
	 * It provides automatic conversion between primitive data type into equivalent wrapper class (Known as Autoboxing) 
	 * and vice versa (Known as Unboxing).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i = 10;
		Integer a = 10;

		a = i; // AutoBoxing
		i = a; // Unboxing 
		
		System.out.println("a["+a+"] i["+i+"] ");
	}

}
