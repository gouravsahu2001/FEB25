interface Photosynthesis{
	void absorbSunlight();
}

interface Respiration{
	void releaseOxygen();
}

class Plant implements Photosynthesis, Respiration{
	private String plantName;
	
	Plant(String name){
		this.plantName=name;
	}
	
	String getPlantName() {
		return plantName;
	}
	
	public void absorbSunlight() {
		System.out.println("Plant is absorbing sunlight for photosynthesis.");
	}
	
	public void releaseOxygen() {
		System.out.println("Plant is releasing oxygen through respiration.");
	}
}

public class PlantsTest {

	public static void main(String[] args) {
		
		Plant p1=new Plant("Mango Tree");
		System.out.println("Plant Name : "+p1.getPlantName());
		p1.absorbSunlight();
		p1.releaseOxygen();
		
		System.out.println();
		
		Plant p2=new Plant("Fern");
		System.out.println("Plant Name : "+p2.getPlantName());
		p2.getPlantName();
		p2.absorbSunlight();
		p2.releaseOxygen();

	}

}
