package rest.weather;

public class Clouds {

	private Double all;

	/*
	 * Default constructor
	 */
	public Clouds() {
	}

	/*
	 * Value constructor
	 */
	public Clouds(Double all) {
		this.all = all;
	}

	/*
	 * Get method for all
	 */
	public Double getAll() {
		return all;
	}

	/*
	 * Set method for all
	 */
	public void setAll(Double all) {
		this.all = all;
	}

	@Override
	public String toString() {
		return "Clouds [all=" + all + "]";
	}

}
