package java5features;

public class AssertionExample {

	/**
	 * @param args
	 * Assertion is a statement. It can be used to test a specific condition.
	 * JVM will throws AssertionError when it fails, it is mainly used for testing purpose.
	 * 
	 * Note: Assertion will work only if you enable it while running. VM Arguments should be given as -ea (enable asserion)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start");
		assert 1 > 2;
		System.out.println("Exit");
	}

}
