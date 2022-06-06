package rest.holidays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class HolidayService {

	private static final String H_URL = "http://date.nager.at/api/v1/get";

	/*
	 * Function returns the holidays based on the year in the United Sates
	 */
	public List<Holiday> holidays(int year) throws Exception {
		return holidays(year, "US");
	}

	/*
	 * Function returns the holidays based on the year and country
	 */
	public List<Holiday> holidays(int year, String country) throws Exception {

		String resource = H_URL;
		if (country != null && country.length() > 0) {
			resource += "/" + country.substring(0, 2);
		}
		resource += "/" + year;

		URL url = new URL(resource);

		// Connect to url
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("Accept", "applicatiton/json");

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

			Type listType = new TypeToken<List<Holiday>>() {
			}.getType();
			List<Holiday> holidays = gson.fromJson(data, listType);

			return holidays;

		}
		// Else throw an exception
		else {
			throw new RuntimeException("no holiday data returned");
		}
	}

	/*
	 * Main function to test inside the IDE
	 */
	public static void main(String[] args) {
		HolidayService service = new HolidayService();

		try {
			List<Holiday> holidays = service.holidays(2019, "US");

			for (Holiday holiday : holidays) {
				System.out.println(holiday);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

}
