class Flower{
	String Name;
	String colour;
	String hasFragrance;
	
}
class Rose extends Flower{
	String hasThrons;
	Rose(String Name,String colour,String hasFragrance,String hasThrons){
		this.Name=Name;
		this.colour=colour;
		this.hasFragrance=hasFragrance;
		this.hasThrons=hasThrons;
		System.out.println("---- Rose Details ----");
		System.out.println("Flower Name: "+Name );
		System.out.println("Colour: "+colour);	
		System.out.println("Has Fragerance: "+hasFragrance);
		System.out.println("Has Thrones: "+hasThrons);
		System.out.println();
}
}
class Lily extends Flower{
	String isWaterPlant;
	Lily(String Name,String colour,String hasFragrance,String isWaterPlant){    
		this.Name=Name;
		this.colour=colour;
		this.hasFragrance=hasFragrance;
		this.isWaterPlant=isWaterPlant;
		System.out.println("---- Lily Details ----");
		System.out.println("Flower Name: "+Name );
		System.out.println("Colour: "+colour);	
		System.out.println("Has Fragerance: "+hasFragrance);
		System.out.println("Grows in water: "+isWaterPlant);
}
}
class FlowersExample{
	public static void main(String args[]){
		Rose r=new Rose("Rose","Red","Yes","Yes");
		Lily l=new Lily("Lily","White","Yes","Yes");
	}
}
