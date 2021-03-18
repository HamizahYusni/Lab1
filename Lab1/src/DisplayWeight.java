
public class DisplayWeight {

	public static void main(String[] args) {

		WeightMars mars = new WeightMars();
		
		mars.setWeight(50);
		
		System.out.print("-------------------------------------");
		System.out.print("\nWeight on Earth : " + mars.getWeight());
		System.out.print("\nWeight on Mars : " + mars.calculateWeight() + "\n");
		System.out.print("-------------------------------------\n\n");
		
	}

}
