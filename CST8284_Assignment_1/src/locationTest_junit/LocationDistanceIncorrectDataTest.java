package locationTest_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import location.Location;

/**
 * File name: LocationDistanceIncorrectDataTest.java
 * @author anjad
 * Course: CST8284-302
 * Term: Spring2024
 * Assignment: Assignment 1
 * Date: 6/9/2024
 * Purpose: Junit testing for invalid data
 */
class LocationDistanceIncorrectDataTest {
	
	
	@Test
	public void testInvalidData() {
		
		// Test case 1 : Invalid latitude(out of range)
		Location invalidLocation1 = new Location ("K1B", 100.0, -75.5624);
		assertFalse(invalidLocation1.isValid(), "Invalid latitude should make the location invalid");
		
		// Test case 2: Invalid longitude(out of range)
		Location invalidLocation2 = new Location ("K1B", 100.0, -200.0);
		assertFalse(invalidLocation2.isValid(), "Invalid latitude should make the location invalid");
		
		// Test case 3:Null value for the postal code
		Location invalidLocation3 = new Location (null, 100.0, -75.5624);
		assertFalse(invalidLocation3.isValid(), "Invalid latitude should make the location invalid");
		
		// Test case 4:Empty postal code 
		Location invalidLocation4 = new Location ("", 100.0, -75.5624);
		assertFalse(invalidLocation4.isValid(), "Invalid latitude should make the location invalid");
		
	}

}
