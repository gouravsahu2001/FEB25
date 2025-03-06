public class Question05{
	public static void main(String[] args){
		int a = 3, b = 9;
		System.out.println("Before Swapping: \nA = " + a + "\nB = " + b); 
		a += b;
		b -= a;
		b = -b;
		a -= b;
		System.out.println("After Swapping: \nA = " + a + "\nB = " + b); 
	}
}
