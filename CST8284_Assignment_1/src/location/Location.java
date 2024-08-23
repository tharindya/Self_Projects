package location;

/**
 * File name: Location.java
 * @author anjad
 * Date: 6/9/2024
 * Purpose: purpose of this class is to get the values for variables and do the calculation to get the distance for two places
 */
public class Location {
	/**
	 * Final value for the postal code
	 */
	private final String postalCode;
	/**
	 * Final value component of latitude
	 */
	private final double latitude;
	/**
	 * Final value component of longitude
	 */
	private final double longitude;
	/**
	 * This constructor sets the given information as the postal code, latitude and longitude
	 * @param postalCode
	 * @param latitude
	 * @param longitude
	 */
	public Location(String postalCode,double latitude,double longitude) {
		this.postalCode=postalCode;
		this.latitude=latitude;
		this.longitude=longitude;
	}
	/**
	 * returns the postal code.
	 * @return postalCode
	 */
	public String getpostalCode() {
		return postalCode;
	}
	
	/**
	 * returns the latitude
	 * @return latitude
	 */
	public double getlatitude() {
		return latitude;
	}
	
	/**
	 * returns the longitude
	 * @return longitude
	 */
	public double getlongitude() {
		return longitude;
	}
	
	
	/**
	 * The boolean method is initiated here to throw an exception for the incorrect test data.
	 * @return isValid
	 */
	public boolean isValid() {
        // Check for invalid data
        return postalCode != null && !postalCode.isEmpty() &&
               latitude >= -90 && latitude <= 90 &&
               longitude >= -180 && longitude <= 180;
    }
	/**
	 * method that gets the first places' location and subtract the second places' location and gets the distance difference
	 * @param location
	 * @return
	 */
	public double distanceTo(Location location) {
		double xDiff = location.getlongitude()-longitude;
		double yDiff = location.getlatitude()-latitude;
		return Math.sqrt((xDiff*xDiff) + (yDiff*yDiff) );
	}
}
