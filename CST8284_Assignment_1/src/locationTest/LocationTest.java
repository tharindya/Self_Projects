package locationTest;
import location.Location;
/**
 * File name: LocationTest.java
 * @author anjad
 * Course: CST8284-302
 * Term: Spring2024
 * Assignment: Assignment 1
 * Date: 6/9/2024
 * Purpose: The values for each variable is set in here and the arrays are set here to store the data 
 */
public class LocationTest {

	/**
	 * In this class the values are passed to the Location class through the constructor
	 * @param args
	 */
	public static void main(String[] args) {
		final int pcLength = 5;
		// An array of 5 is instantiated and stored the values for postal codes
		String[] psCodes = {
				"K1B",
				"k2B",
				"K2L",
				"K1Z",
				"K1G"
		};
		
		//Multi-Dimensional array is instantiated and the longitudes and latitudes are stored.
		double[][] latLongs = {
				{45.4325,-75.5624},
				{45.3679,-75.7888},
				{45.3125,-75.8838},
				{45.3956,-75.7462},
				{45.4118,-75.6304}
		};
		
		
		Location[] locations = new Location[pcLength];
		for(int i = 0; i < pcLength; i++) {
			locations[i] = new Location(psCodes[i], latLongs[i][0],latLongs[i][1]);
		}
		
		System.out.printf("%8s %7s %7s %7s %7s %7s","","K1B","K2B","K2L","K1Z","K1G");
		
		for(int i = 0; i < pcLength; i++){
			System.out.printf("\n%8s",psCodes[i]);
			for(int j =0; j < pcLength; j++) {
				System.out.printf("%8.3f",locations[i].distanceTo(locations[j]));
			}
			
		}
	}

}
