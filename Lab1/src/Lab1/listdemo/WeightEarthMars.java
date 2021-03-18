
package Lab1.listdemo;

import Lab1.demo.*;

/**
 * This program store list of human weight on Earth and Mars.
 * @author HamizahYusni. DAD Class
 * 
 */
public class WeightEarthMars {

	public static void main(String[] args) {

		WeightMars mars = new WeightMars();
		
		mars.setWeightEarth(50);
		
		System.out.print("-------------------------------------");
		System.out.print("\nWeight on Earth : " + mars.getWeightEarth());
		System.out.print("\nWeight on Mars : " + mars.getWeightMars() + "\n");
		System.out.print("-------------------------------------\n\n");
		
		mars.setWeightEarth(45);
		
		System.out.print("-------------------------------------");
		System.out.print("\nWeight on Earth : " + mars.getWeightEarth());
		System.out.print("\nWeight on Mars : " + mars.getWeightMars() + "\n");
		System.out.print("-------------------------------------\n\n");
		
		mars.setWeightEarth(88);
		
		System.out.print("-------------------------------------");
		System.out.print("\nWeight on Earth : " + mars.getWeightEarth());
		System.out.print("\nWeight on Mars : " + mars.getWeightMars() + "\n");
		System.out.print("-------------------------------------\n\n");
	}
}
