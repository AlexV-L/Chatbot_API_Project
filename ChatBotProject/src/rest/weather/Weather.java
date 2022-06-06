package rest.weather;

public class Weather {
	private Integer id;
	private String main;
	private String description;
	private String icon;

	/*
	 * Default constructor
	 */
	public Weather() {

	}

	/*
	 * Value constructor
	 */
	public Weather(Integer id, String main, String description, String icon) {
		this.id = id;
		this.main = main;
		this.description = description;
		this.icon = icon;
	}

	/*
	 * Get method for id
	 */
	public Integer getId() {
		return id;
	}

	/*
	 * Set method for speed
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/*
	 * Get method for main
	 */
	public String getMain() {
		return main;
	}

	/*
	 * Set method for main
	 */
	public void setMain(String main) {
		this.main = main;
	}

	/*
	 * Get method for description
	 */
	public String getDescription() {
		return description;
	}

	/*
	 * Set method for description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * Get method for icon
	 */
	public String getIcon() {
		return icon;
	}

	/*
	 * Set method for icon
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Override
	public String toString() {
		return "Weather [id=" + id + ", main=" + main + ", description=" + description + ", icon=" + icon + "]";
	}
}
