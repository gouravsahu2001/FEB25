abstract class Vehicle{ //Abstract class 
	abstract void method(); //Abstract method
	void display(){ //Non abstract method
		System.out.println("----- Vehicle details ----- ");
}
}
class Bike extends Vehicle{
	void method(){
		System.out.println("Abstract Method Running");
	}
	void show(String name){
		System.out.println("Bike name is : "+name);
	}
	static void mileage(int avg){
		System.out.println("Mileage of the bike is : "+avg+" km/ltr");
	}
}
class AbstractionDemo{
	public static void main(String args[]){
		Bike b=new Bike();//Reference of Bike class
		b.method();
		b.display();
		b.show("Honda Shine");
		b.mileage(70);
	}
}
