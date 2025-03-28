import java.util.Scanner;

class BMICalculator{
	private double height;
	private double weight;
	
	BMICalculator(double height,double weight){
		this.height=height;
		this.weight=weight;
	}
	//Setter Method for height
	void setHeight(double height) {
		this.height=height;
		
	}
	//Setter Method for weight
	void setWeight(double weight) {
		this.weight=weight;
	}
	
	//Getter Method for height
	double getHeight() {
		return height;
	}
	
	//Getter Method for weight
	double getWeight() {
		return weight;
	} 
	
	double calculateBMI() {
		double BMI = weight/(height*height);
		return BMI;
	}
}
public class BMICalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BMICalculator b = new BMICalculator(0.0,0.0);
		
		System.out.println("Enter Height in meters : ");
		double ht=sc.nextDouble();
		b.setHeight(ht);
		
		System.out.println("Enter Weight in kilograms : ");
		double wt=sc.nextDouble();
		b.setWeight(wt);
		
		System.out.println("BMI is : "+b.calculateBMI());
	}

}
