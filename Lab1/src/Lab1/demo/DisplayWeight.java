package Lab1.demo;

/**
 * This program display weight on Earth and weight on Mars.
 * @author HamizahYusni. DAD Class
 * 
 */
public class DisplayWeight {

	public static void main(String[] args) {

		WeightMars mars = new WeightMars();
		
		mars.setWeightEarth(50);
		
		System.out.print("-------------------------------------");
		System.out.print("\nWeight on Earth : " + mars.getWeightEarth());
		System.out.print("\nWeight on Mars : " + mars.getWeightMars() + "\n");
		System.out.print("-------------------------------------\n\n");
		
	}

}
	