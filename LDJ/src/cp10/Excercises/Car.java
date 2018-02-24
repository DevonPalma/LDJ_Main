package cp10.Excercises;

public class Car implements CarbonFootprint {
	private String make;
	private String model;
	private double MPG;
	private String year;
	private double milesDriven;
	
	public Car(String make, String model, double MPG, String year) {
		this.make = make;
		this.model = model;
		this.MPG = MPG;
		this.year = year;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setMPG(double MPG) {
		this.MPG = MPG;
	}
	
	public double getMPG() {
		return MPG;
	}
	
	public String getYear() {
		return year;
	}

	public void setMilesDriven(double miles) {
		this.milesDriven = miles;
	}
	
	public double getMilesDriven() {
		return milesDriven;
	}
	
	@Override
	public double getCarbonFootprint() {
		return getMilesDriven() * getMPG();
	}
}
