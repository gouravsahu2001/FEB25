public class Question09{
	public static void main(String[] args){
		int x = 25, y = 76;
		check(x);
		check(y);
	}
	
	public static void check(int a){
		System.out.println((a>=20 && a<=50)? a + " is within the range." : a + " is within the range");
	} 
}	
