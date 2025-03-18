public class ArithmeticUnchecked {

	public static void main(String[] args) {
		
		
		try {
			int i=100;
			int result=i/0;//Exception
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			e.printStackTrace(); //For developer to show the Exception details.
			System.out.println("Can not divide by zero....!");
		}
		
	}
