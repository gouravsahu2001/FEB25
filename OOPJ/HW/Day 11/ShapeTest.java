abstract class Shape{
	protected String shapeName;
	
	Shape(String shapeName){
		this.shapeName=shapeName;
	}
	String getShapeName() {
		return shapeName;
	}
	abstract double calculateArea();
}

class Circle extends Shape{
	private double radius;
	
	Circle(String shapeName, double radius){
		super(shapeName);
		this.radius=radius;
	}
	
	public double calculateArea() {
		return 3.14*radius*radius;
		
	}
}

class Rectangle  extends Shape{
	private double length;
	private double width;
	Rectangle(String shapeName, double length, double width){
		super(shapeName);
		this.length=length;
		this.width=width;
	}
		public double calculateArea() {
		return length*width;
		
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle("Circle",5.0d);
        System.out.println("Shape: " + circle.getShapeName());
        System.out.println("Area: " + circle.calculateArea());

       
        Rectangle rectangle = new Rectangle("Rectangle",4.0d, 6.0d);
        System.out.println("\nShape: " + rectangle.getShapeName());
        System.out.println("Area: " + rectangle.calculateArea());
	}

}
