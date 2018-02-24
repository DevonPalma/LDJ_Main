package cp02.Excercises;

public class WorldPopGrowth {
	public static void main(String[] args) {
		double currentGrowthRate = 0.011;
		double currentPop = 7600000000.0;
		
		System.out.printf("%-6s %-12s\n", "year", "population");
		System.out.printf("%-6d %-,12.0f\n", 1, currentPop * Math.pow((1 + currentGrowthRate), 1));
		System.out.printf("%-6d %-,12.0f\n", 2, currentPop * Math.pow((1 + currentGrowthRate), 2));
		System.out.printf("%-6d %-,12.0f\n", 3, currentPop * Math.pow((1 + currentGrowthRate), 3));
		System.out.printf("%-6d %-,12.0f\n", 4, currentPop * Math.pow((1 + currentGrowthRate), 4));
		System.out.printf("%-6d %-,12.0f\n", 5, currentPop * Math.pow((1 + currentGrowthRate), 5));
		
	}
}
