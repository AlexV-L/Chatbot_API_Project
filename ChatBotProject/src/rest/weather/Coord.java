package rest.weather;

public class Coord {
	private Double lon;
	private Double lat;

	/*
	 * Default constructor
	 */
	public Coord() {
	}

	/*
	 * Value constructor
	 */
	public Coord(Double lon, Double lat) {
		this.lon = lon;
		this.lat = lat;
	}

	/*
	 * Get method for longitude
	 */
	public Double getLon() {
		return lon;
	}

	/*
	 * Set method for longitude
	 */
	public void setLon(Double lon) {
		this.lon = lon;
	}

	/*
	 * Set method for latitude
	 */
	public Double getLat() {
		return lat;
	}

	/*
	 * Set method for latitude
	 */
	public void setLat(Double lat) {
		this.lat = lat;
	}

	@Override
	public String toString() {
		return "Coord [lon=" + lon + ", lat=" + lat + "]";
	}

}
