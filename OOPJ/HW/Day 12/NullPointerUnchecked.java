public class NullPointerUnchecked {

	public static void main(String[] args) {
		
		String s=null;//s reference is now pointing to null
		
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			e.printStackTrace(); //For developer to show the Exception details.
			System.out.println("s is pointing to null...!");
		}
		
	}
