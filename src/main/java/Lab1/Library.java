/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Lab1;

/**
 * Class for demo
 * @author clydeang421
 * @version 1.0
 */
public class Library {
	/**
	 * Main body function
	 * @param arg does not do anything
	 */
	public static void main(String arg[]) {
		Library lib = new Library();
		if (lib.someLibraryMethod())
			System.out.println("When there is a fire , commit and push.");
		// added comment
		System.out.println("Added new print.");
	}
	/**
	 * Default Constructor
	 */
	public Library () {
	}
	/**
	 * Test Function
	 * @return always the boolean value true
	 */
    public boolean someLibraryMethod() {
        return true;
    }
}
