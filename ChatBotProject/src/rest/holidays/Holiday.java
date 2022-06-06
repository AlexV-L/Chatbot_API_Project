package rest.holidays;

import java.util.List;

public class Holiday {

	private String date;
	private String localName;
	private String name;
	private String countryCode;
	private boolean fixed;
	private boolean countyOfficialHoliday;
	private boolean countyAdministrationHoliday;
	private boolean global;
	private List<String> counties = null;
	private String launchYear = null;

	/*
	 * Get method for date
	 */
	public String getDate() {
		return date;
	}

	/*
	 * Set method for date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/*
	 * Get method for local name
	 */
	public String getLocalName() {
		return localName;
	}

	/*
	 * Set method for local name
	 */
	public void setLocalName(String localName) {
		this.localName = localName;
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
	 * Get method for country code
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/*
	 * Set method for country code
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/*
	 * Get method for fixed
	 */
	public boolean isFixed() {
		return fixed;
	}

	/*
	 * Set method for fixed
	 */
	public void setFixed(boolean fixed) {
		this.fixed = fixed;
	}

	/*
	 * Get method for country's official holiday
	 */
	public boolean isCountyOfficialHoliday() {
		return countyOfficialHoliday;
	}

	/*
	 * Set method for country's official holiday
	 */
	public void setCountyOfficialHoliday(boolean countyOfficialHoliday) {
		this.countyOfficialHoliday = countyOfficialHoliday;
	}

	/*
	 * Get method for country's administration holiday
	 */
	public boolean isCountyAdministrationHoliday() {
		return countyAdministrationHoliday;
	}

	/*
	 * Set method for country's administration holiday
	 */
	public void setCountyAdministrationHoliday(boolean countyAdministrationHoliday) {
		this.countyAdministrationHoliday = countyAdministrationHoliday;
	}

	/*
	 * Get method for global
	 */
	public boolean isGlobal() {
		return global;
	}

	/*
	 * Set method for global
	 */
	public void setGlobal(boolean global) {
		this.global = global;
	}

	/*
	 * Get method for countries
	 */
	public List<String> getCounties() {
		return counties;
	}

	/*
	 * Set method for global
	 */
	public void setCounties(List<String> counties) {
		this.counties = counties;
	}

	/*
	 * Get method for launch year
	 */
	public String getLaunchYear() {
		return launchYear;
	}

	/*
	 * Set method for launch year
	 */
	public void setLaunchYear(String launchYear) {
		this.launchYear = launchYear;
	}

	@Override
	public String toString() {
		return "Holiday [date=" + date + ", localName=" + localName + ", name=" + name + ", countryCode=" + countryCode
				+ ", fixed=" + fixed + ", countyOfficialHoliday=" + countyOfficialHoliday
				+ ", countyAdministrationHoliday=" + countyAdministrationHoliday + ", global=" + global + ", counties="
				+ counties + ", launchYear=" + launchYear + "]";
	}

}
