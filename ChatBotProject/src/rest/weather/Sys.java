package rest.weather;

public class Sys {
	private Integer type;
	private Long id;
	private Double message;
	private String country;
	private long sunrise;
	private long sunset;

	/*
	 * Default constructor
	 */
	public Sys() {
	}

	/*
	 * Value constructor
	 */
	public Sys(Integer type, Long id, Double message, String country, long sunrise, long sunset) {
		this.type = type;
		this.id = id;
		this.message = message;
		this.country = country;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}

	/*
	 * Get method for type
	 */
	public Integer getType() {
		return type;
	}

	/*
	 * Set method for type
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/*
	 * Get method for id
	 */
	public Long getId() {
		return id;
	}

	/*
	 * Set method for id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/*
	 * Get method for message
	 */
	public Double getMessage() {
		return message;
	}

	/*
	 * Set method for message
	 */
	public void setMessage(Double message) {
		this.message = message;
	}

	/*
	 * Get method for country
	 */
	public String getCountry() {
		return country;
	}

	/*
	 * Set method for country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/*
	 * Get method for sunrise
	 */
	public long getSunrise() {
		return sunrise;
	}

	/*
	 * Set method for sunrise
	 */
	public void setSunrise(long sunrise) {
		this.sunrise = sunrise;
	}

	/*
	 * Get method for sunset
	 */
	public long getSunset() {
		return sunset;
	}

	public void setSunset(long sunset) {
		this.sunset = sunset;
	}

	@Override
	public String toString() {
		return "Sys [type=" + type + ", id=" + id + ", message=" + message + ", country=" + country + ", sunrise="
				+ sunrise + ", sunset=" + sunset + "]";
	}
}
