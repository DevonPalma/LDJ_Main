package cp10.Excercises;

public class CarbonFootprintTest {
	public static void main(String[] args) {
		CarbonFootprint[] a = new CarbonFootprint[3];
		
		a[0] = new Building(5, Building.buildingType.FACTORY);
		a[1] = new Car("Ford", "Ranger", 16, "1997");
		((Car) a[1]).setMilesDriven(400);
		a[2] = new Bicycle("Red", 10.3, 132.32);
		
		double totalFootprint = 0;
		
		for (CarbonFootprint b : a) {
			totalFootprint += b.getCarbonFootprint();
		}
		
		System.out.printf("Total footprint: %.2f", totalFootprint);
	}
}
