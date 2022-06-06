package rest.weather;

public class Wind {
	private Double speed;
	private Integer deg;

	/*
	 * Default constructor
	 */
	public Wind() {
	}

	/*
	 * Value constructor
	 */
	public Wind(Double speed, Integer deg) {
		super();
		this.speed = speed;
		this.deg = deg;
	}

	/*
	 * Get method for speed
	 */
	public Double getSpeed() {
		return speed;
	}

	/*
	 * Set method for speed
	 */
	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	/*
	 * Get method for degrees
	 */
	public Integer getDeg() {
		return deg;
	}

	/*
	 * Set method for degrees
	 */
	public void setDeg(Integer deg) {
		this.deg = deg;
	}

	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", deg=" + deg + "]";
	}
}
