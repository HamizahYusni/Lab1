
public class WeightMars {

	private int weightEarth;
	private double weightMars;
	
	public int getWeight() {
		return weightEarth;
	}
	
	public void setWeight(int weightEarth) {
		this.weightEarth = weightEarth;
	}
	
	public double calculateWeight() {
		weightMars = 0.3783*weightEarth;
		return weightMars;
	}
}
