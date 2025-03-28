package Assignment_5;

class Room{
	double Height;
	double Breadth;
	double Width;
	
	Room(double height,double breadth,double width){
		this.Height=height;
		this.Breadth=breadth;
		this.Width=width;
	}
	
	double volume() {
		return Height*Breadth*Width;
	}
	
}

public class RoomDemo {
	public static void main(String args[]) {
		Room r1 = new Room(12.5,10.5,11.65);
		Room r2 = new Room(13.5,9.5,14.65);
		Room r3 = new Room(8.6,5.5,2.52);
		Room r4 = new Room(1.5,18.9,6.65);
		System.out.println("Volume of the room is : "+r1.volume()+" Units Qube");
		System.out.println("Volume of the room is : "+r2.volume()+" Units Qube");
		System.out.println("Volume of the room is : "+r3.volume()+" Units Qube");
		System.out.println("Volume of the room is : "+r4.volume()+" Units Qube");
	}

}
