package cp10.Excercises;

public class Building implements CarbonFootprint {
	
	public enum buildingType { OFFICE, HOUSE, FACTORY };
	
	private int floors;
	private buildingType type;
	
	public Building(int floors, buildingType type) {
		this.floors = floors;
		this.type = type;
	}
	
	public int getFloors() {
		return floors;
	}
	
	public buildingType getType() {
		return type;
	}

	@Override
	public double getCarbonFootprint() {
		switch(type) {
		case OFFICE:
			return 30 * floors;
		case HOUSE:
			return 10 * floors;
		case FACTORY:
			return 100 * floors;
		default:
			return 0;
		}
	}
}
