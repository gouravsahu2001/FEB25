public class Question06{
	public static void main(String[] args){
		int a = 8;
    int b = 4; 
    int c = 1;
		int largest = ((a>b && a>c)? a : (b>a && b>c)? b : c);
		System.out.println(largest + " is the largest number.");
	}
}	
