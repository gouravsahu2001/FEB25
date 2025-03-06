import java.util.Scanner;

public class Question08{
	public static void main(String[] args){
		boolean a = true, b = false, c = true;
		
		if((a && (b||c)) || (c && (a||b)) || (b && (a||c))){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}
}	
