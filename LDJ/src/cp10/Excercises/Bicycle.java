package cp10.Excercises;

public class Bicycle implements CarbonFootprint {
	private String color;
	private double wheelDiameter;
	private double price;
	
	public Bicycle(String color, double wheelDiameter, double price) {
		this.color = color;
		this.wheelDiameter = wheelDiameter;
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getWheelDiameter() {
		return wheelDiameter;
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public double getCarbonFootprint() {
		return 0;
	}
	
	
}
