class Box{
	private double Height;
	private double Breadth;
	private double Width;
	
	Box(double height,double breadth,double width){
		this.Height=height;
		this.Breadth=breadth;
		this.Width=width;
	}
	
	double getVolume() {
		return Height*Breadth*Width;
	}
	
	double getArea() {
		double Area = ((Breadth*Width)+(Breadth*Height)+(Breadth*Width))*2; 
		return Area;
	}
}

public class BoxArea {

	public static void main(String[] args) {
	Box b1 = new Box(15.3,16.0,9.5);
	System.out.println("Volume of the box 1 is : "+b1.getVolume());
	System.out.println("Area of the box is : "+b1.getArea());
	
	System.out.println("-------------------------------------");
	
	Box b2 = new Box(11.2,8.5,4.9);
	System.out.println("Volume of the box 2 is : "+b2.getVolume());
	System.out.println("Area of the box is : "+b2.getArea());
	}

}
