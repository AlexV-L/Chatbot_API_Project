package rest.weather;

public class Main {
	private Double temp;
	private Double pressure;
	private Double humidity;
	private Double temp_min;
	private Double temp_max;
	private Double sea_level;
	private Double grnd_level;

	/*
	 * Default constructor
	 */
	public Main() {
	}

	/*
	 * Value constructor
	 */
	public Main(Double temp, Double pressure, Double humidity, Double temp_min, Double temp_max, Double sea_level,
			Double grnd_level) {
		this.temp = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.sea_level = sea_level;
		this.grnd_level = grnd_level;
	}

	/*
	 * Set method for current temperature
	 */
	public Double getTemp() {
		return temp;
	}

	/*
	 * Set method for current temperature
	 */
	public void setTemp(Double temp) {
		this.temp = temp;
	}

	/*
	 * Get method for pressure
	 */
	public Double getPressure() {
		return pressure;
	}

	/*
	 * Set method for pressure
	 */
	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}

	/*
	 * Get method for humidity
	 */
	public Double getHumidity() {
		return humidity;
	}

	/*
	 * Set method for humidity
	 */
	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}

	/*
	 * Get method for min temperature
	 */
	public Double getTemp_min() {
		return temp_min;
	}

	/*
	 * Set method for min temperature
	 */
	public void setTemp_min(Double temp_min) {
		this.temp_min = temp_min;
	}

	/*
	 * Get method for max temperature
	 */
	public Double getTemp_max() {
		return temp_max;
	}

	/*
	 * Set method for max temperature
	 */
	public void setTemp_max(Double temp_max) {
		this.temp_max = temp_max;
	}

	/*
	 * Get method for sea level
	 */
	public Double getSea_level() {
		return sea_level;
	}

	/*
	 * Set method for sea level
	 */
	public void setSea_level(Double sea_level) {
		this.sea_level = sea_level;
	}

	/*
	 * Get method for ground level
	 */
	public Double getGrnd_level() {
		return grnd_level;
	}

	/*
	 * Set method for ground level
	 */
	public void setGrnd_level(Double grnd_level) {
		this.grnd_level = grnd_level;
	}

	@Override
	public String toString() {
		return "Main [temp=" + temp + ", pressure=" + pressure + ", humidity=" + humidity + ", temp_min=" + temp_min
				+ ", temp_max=" + temp_max + ", sea_level=" + sea_level + ", grnd_level=" + grnd_level + "]";
	}

}
