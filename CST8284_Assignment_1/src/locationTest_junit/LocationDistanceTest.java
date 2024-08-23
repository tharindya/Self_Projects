package locationTest_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import location.Location;

/**
 * File name: LocationDistanceTest.java
 * @author anjad
 * Date: 6/9/2024
 * Purpose: Junit testing for the valid data 
 */
class LocationDistanceTest {
	
	/**
	 * this 4 variables  
	 */
	private Location loc1;
	private Location loc2;
	private Location loc3;
	private Location loc4;
	
	
	/**
	 * This method runs before each test method. 
	 * In here 4 location objects have been instantiated with specific codes and locations.
	 */
	@BeforeEach
	public void setUp() {
		loc1 = new Location("K1B", 45.4325, -75.5624);
		loc2 = new Location("K2B", 45.3679, -75.7888);
		loc3 = new Location("K2L", 45.3125, -75.8838);
		loc4 = new Location("K1Z", 45.3956, -75.7462);
		
	}
	
	/**
	 * 3 variables have been declared to do the calculation for the distance calculate method.
	 * the purpose of these 3 variables are to compare the results of Location.distanceTo() with an expected result.
	 * expectedDistance12,expectedDistance13,expectedDistance14 holds the value i expect that 'locN.distanceTo(locN+1)' will to return.
	 * The distanceTo method in the Location class computes the distance between the current Location object and the Location object passed as a parameter.
	 * It uses the latitude and longitude of both locations to calculate the distance.
	 * The result of this calculation is the distance between the two locations.
 	 */
	@Test
	public void testDistanceTO() {
		double expectedDistance12 = Math.sqrt(Math.pow(loc2.getlongitude() - loc1.getlongitude(), 2) +
                Math.pow(loc2.getlatitude() - loc1.getlatitude(), 2));
		double expectedDistance13 = Math.sqrt(Math.pow(loc3.getlongitude() - loc1.getlongitude(), 2) +
                Math.pow(loc3.getlatitude() - loc1.getlatitude(), 2));
		double expectedDistance14 = Math.sqrt(Math.pow(loc4.getlongitude() - loc1.getlongitude(), 2) +
                Math.pow(loc4.getlatitude() - loc1.getlatitude(), 2));
		/**
		 * I used assertions(assertEquals) to compare the actual result of 'locN.distanceTo(locN+1)' with 'expectedDistanceN+(N+1)' variable. 
		 * If they match, the test passes; if not, it fails
		 */
		assertEquals(expectedDistance12, loc1.distanceTo(loc2), "Distance from location 1 to location 2 should be " + expectedDistance12);
        assertEquals(expectedDistance13, loc1.distanceTo(loc3), "Distance from location 1 to location 3 should be " + expectedDistance13);
        assertEquals(expectedDistance14, loc1.distanceTo(loc4), "Distance from location 1 to location 4 should be " + expectedDistance14);
        
	}
	
}
