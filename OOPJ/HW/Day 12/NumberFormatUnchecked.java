public class NumberFormatUnchecked {

	public static void main(String[] args) {
		
		String s1="100";
		String s2="a";
		try {
			int i=Integer.parseInt(s1);
			int j=Integer.parseInt(s2);//Exception 
		}
		catch(NumberFormatException e) {
			e.printStackTrace(); //For developer to show the Exception details.
			System.out.println("Exception Caught: Trying to convert String to int");
		}
		
	}

}
