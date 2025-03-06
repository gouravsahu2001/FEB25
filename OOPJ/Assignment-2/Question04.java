import java.util.Scanner;

public class Question04{
	public static void main(String[] args){
		int num = 18;
		
		if(num<0){
			num = -num;
		}
		
		while(num>3){
			num = (num & 3) + (num >> 2);
		}
		
		if(num==0 || num==3)
			System.out.println("Division by 3");
		else
			System.out.println("Not division by 3");
	
	}
}
