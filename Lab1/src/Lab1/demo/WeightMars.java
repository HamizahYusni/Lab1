package Lab1.demo;

/**
 * This program convert weight on Earth to weight on Mars.
 * @author HamizahYusni. DAD Class
 * 
 */
public class WeightMars {

	private int weightEarth;
	private double weightMars;
	
	public int getWeightEarth() {
		return weightEarth;
	}
	
	public void setWeightEarth(int weightEarth) {
		this.weightEarth = weightEarth;
	}
	
	public double getWeightMars() {
		weightMars = 0.3783*weightEarth;
		return weightMars;
	}
}