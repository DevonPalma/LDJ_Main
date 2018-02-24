/* Pseudocode
Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
data from the user.

input miles driven and gallons used 
display MPG, and total MPG of all trips
use sentinel-control

miles, gallons, total miles, total gallons
loop
	get miles & gallons
	check for sentinel
	display MPG
display MPG for all trips
	

*/

package cp04.Exercises;

import java.util.Scanner;

public class GasMilage {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int totalMiles = 0;
		int totalGallons = 0;
		int miles = 0;
		int gallons = 0;
		int counter = 1;
		
		while ((miles != -1) && (gallons != -1)) {
			System.out.printf("Trip %d miles: ", counter);
			miles = input.nextInt();
			if (miles != -1) {
				System.out.printf("Trip %d gallons: ", counter);
				gallons = input.nextInt();
				if (gallons != -1) {
					System.out.printf("Trip %d MPG: %.1f\n",
							counter, (float) miles/gallons);
					totalMiles += miles;
					totalGallons += gallons;
					counter++;
				}
			}
		}
		System.out.printf("Total MPG: %.1f", (float) totalMiles/totalGallons);
		
		
	}
}
