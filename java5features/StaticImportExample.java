package java5features;

import static java.lang.Math.*;
import static java.lang.System.*;

public class StaticImportExample {

	/**
	 * @param args
	 * We can directly access static members and methods without referring static class name.
	 * Increase the complexity of reading if we are over using static import. 
	 */
	public static void main(String[] args) {

		int i = 10;
		out.println(sqrt(100)); // Math.sqrt(i); Removed Math.
		out.println(pow(i,2));
		
	}

}
