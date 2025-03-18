public class ArrayIndexOutUnchecked {

	public static void main(String[] args) {
		
		String s[] = {"a","b","c","d"};
		try {
			System.out.println(s[10]); //Exception
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); //For developer to show the Exception details.
			System.out.println("Exception Caught: Trying to access index that does not exist....!");
		}
		
	}

}
