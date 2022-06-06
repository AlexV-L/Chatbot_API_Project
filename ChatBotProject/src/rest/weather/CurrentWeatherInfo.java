package rest.weather;

import java.util.List;

public class CurrentWeatherInfo {
	private Coord coord;
	private List<Weather> weather;
	private String base;
	private Main main;
	private Wind wind;
	private Clouds clouds;
	private Rain rain;
	private Long dt;
	private Sys sys;
	private Long id;
	private String name;
	private Integer cod;

	/*
	 * Default constructor
	 */
	public CurrentWeatherInfo() {
	}

	/*
	 * Value constructor
	 */
	public CurrentWeatherInfo(Coord coord, List<Weather> weather, String base, Main main, Wind wind, Clouds clouds,
			Rain rain, Long dt, Sys sys, Long id, String name, Integer cod) {
		this.coord = coord;
		this.weather = weather;
		this.base = base;
		this.main = main;
		this.wind = wind;
		this.clouds = clouds;
		this.rain = rain;
		this.dt = dt;
		this.sys = sys;
		this.id = id;
		this.name = name;
		this.cod = cod;
	}

	/*
	 * Get method for coordinates
	 */
	public Coord getCoord() {
		return coord;
	}

	/*
	 * Set method for coordinates
	 */
	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	/*
	 * Get method for weather
	 */
	public List<Weather> getWeather() {
		return weather;
	}

	/*
	 * Get method for weather
	 */
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	/*
	 * Get method for base
	 */
	public String getBase() {
		return base;
	}

	/*
	 * Set method for base
	 */
	public void setBase(String base) {
		this.base = base;
	}

	/*
	 * Get method for main
	 */
	public Main getMain() {
		return main;
	}

	/*
	 * Set method for main
	 */
	public void setMain(Main main) {
		this.main = main;
	}

	/*
	 * Get method for wind
	 */
	public Wind getWind() {
		return wind;
	}

	/*
	 * Set method for wind
	 */
	public void setWind(Wind wind) {
		this.wind = wind;
	}

	/*
	 * Get method for clouds
	 */
	public Clouds getClouds() {
		return clouds;
	}

	/*
	 * Set method for clouds
	 */
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	/*
	 * Get method for rain
	 */
	public Rain getRain() {
		return rain;
	}

	/*
	 * Set method for rain
	 */
	public void setRain(Rain rain) {
		this.rain = rain;
	}

	/*
	 * Get method for dt
	 */
	public Long getDt() {
		return dt;
	}

	/*
	 * Set method for dt
	 */
	public void setDt(Long dt) {
		this.dt = dt;
	}

	/*
	 * Get method for sys
	 */
	public Sys getSys() {
		return sys;
	}

	/*
	 * Set method for sys
	 */
	public void setSys(Sys sys) {
		this.sys = sys;
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
	 * Get method for name
	 */
	public String getName() {
		return name;
	}

	/*
	 * Set method for name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * Get method for cod
	 */
	public Integer getCod() {
		return cod;
	}

	/*
	 * Set method for cod
	 */
	public void setCod(Integer cod) {
		this.cod = cod;
	}

	@Override
	public String toString() {
		return "CurrentWeatherInfo [coord=" + coord + ", weather=" + weather + ", base=" + base + ", main=" + main
				+ ", wind=" + wind + ", clouds=" + clouds + ", rain=" + rain + ", dt=" + dt + ", sys=" + sys + ", id="
				+ id + ", name=" + name + ", cod=" + cod + "]";
	}

}
