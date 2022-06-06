package rest.weather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import rest.holidays.Holiday;
import rest.holidays.HolidayService;

public class WeatherService {

	private static final String W_URL = "http://api.openweathermap.org/data/2.5/weather";
	private static final String W_KEY = "e4e22ffc0c0cde5d37ec852feb8424e1";
	private static final String U_ENG = "imperial";

	/*
	 * Function returns the temperatures based on zip code in the United States
	 */
	public List<Double> temperatureByZip(int zipCode) throws Exception {
		return temperatureByZip(zipCode, "US");
	}

	/*
	 * Function returns the temperatures based on zip code and country
	 */
	public List<Double> temperatureByZip(int zipCode, String country) throws Exception {
		String location = "zip=" + zipCode;
		if (country != null && country.length() > 0) {
			location += "," + country.substring(0, 2);
		}
		String unit = "&units=" + U_ENG;
		String appId = "&APPID=" + W_KEY;
		URL url = new URL(W_URL + "?" + location + unit + appId);

		// Connect to url
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("Accept", "application/json");

		int responseCode = connection.getResponseCode();
		// If statement to check if errors occur within connection
		if (responseCode != 200) {
			throw new RuntimeException("Failed - HTTP error code : " + responseCode);
		}
		// Message reader
		BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

		String data = "";
		String line = null;
		// while block code to start reading messages
		while ((line = br.readLine()) != null) {
			data += line;
		}

		// If block code to check weather json object is not empty
		if (data.length() > 0) {
			Gson gson = new Gson();
			CurrentWeatherInfo weather = gson.fromJson(data, CurrentWeatherInfo.class);

			List<Double> temperatures = new ArrayList<>();
			temperatures.add(weather.getMain().getTemp());
			temperatures.add(weather.getMain().getTemp_max());
			temperatures.add(weather.getMain().getTemp_min());

			return temperatures;
		}
		// Else throw an exception
		else {
			throw new RuntimeException("no weather data returned");
		}
	}

	/*
	 * Main function to test inside the IDE
	 */
	public static void main(String[] args) {
		WeatherService service = new WeatherService();

		try {
			List<Double> temperatures = service.temperatureByZip(75080, "US");

			for (Double temperature : temperatures) {
				System.out.println(temperature);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

}
