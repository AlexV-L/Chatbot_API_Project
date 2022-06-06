
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jibble.pircbot.*;

import rest.holidays.Holiday;
import rest.holidays.HolidayService;
import rest.weather.WeatherService;

public class MyBot extends PircBot {

	/*
	 * Default Constructor
	 */
	public MyBot() {
	}

	/*
	 * Value Constructor
	 */
	public MyBot(String name) {
		this.setName(name);
	}

	/*
	 * Function returns a message to the sender once the sender joins the channel.
	 */
	public void onJoin(String channel, String sender, String login, String hostname) {
		if (!sender.equalsIgnoreCase(getName())) {
			sendMessage(channel, "Hi, " + sender + "! Type 'help" + getName() + "' for help");
		}
	}

	/* Function reads a message and determines what message to send back. */
	public void onMessage(String channel, String sender, String login, String hostname, String message) {
		// If/else block code to determine if the message calls for help or time and/or
		// weather and/or holidays
		if (message.toLowerCase().contains("help") && message.contains(getName())) {
			sendMessage(channel, sender + ": Include 'time' for current time");
			sendMessage(channel, sender + ": Include 'weather' with 'zip code' for temperatures");
			sendMessage(channel, sender + ": Include 'holiday' with 'year' (month optional) for holidays");
		} else {
			if (message.toLowerCase().contains(("time"))) {
				String time = new Date().toString();
				sendMessage(channel, sender + ": The time is now " + time);
			}

			if (message.toLowerCase().contains("weather")) {
				String text = message.toLowerCase();
				int zipCode = parseForZipCode(text);
				if (zipCode > 0) {
					String result = processWeather(zipCode);
					if (result.length() > 0) {
						sendMessage(channel, sender + ": " + result);
					}
				}
			}

			if (message.toLowerCase().contains("holiday")) {
				String text = message.toLowerCase();
				int year = parseForYear(text);
				if (year > 0) {
					int month = parseForMonth(text);
					List<String> results = processHoliday(year, month);
					for (String result : results) {
						sendMessage(channel, sender + ": " + result);
					}

				}
			}
		}
	}

	/* Function finds the zip code in a message and returns it. */
	private int parseForZipCode(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (Character.isDigit(letter)) {
				try {
					int zipCode = Integer.parseInt(text.substring(i, i + 5));
					return zipCode;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return -1;
	}

	/*
	 * Function takes a zip code as an int and returns weather information based on
	 * the zip code.
	 */
	private String processWeather(int zipCode) {
		WeatherService service = new WeatherService();
		String result = "";
		try {
			List<Double> temperatures = service.temperatureByZip(zipCode);
			for (int i = 0; i < temperatures.size(); i++) {
				if (i == 0) {
					result += "Weather in " + zipCode + " is going to be " + temperatures.get(0) + "F";
				}
				if (i == 1 && temperatures.get(i) != null) {
					result += " with a high of " + temperatures.get(i) + "F";
				}
				if (i == 2 && temperatures.get(i) != null) {
					result += " and a low of " + temperatures.get(i) + "F";
				}
			}
		} catch (Exception e) {
			System.out.println("Error in invoking weather service");
			e.printStackTrace();
		}
		return result;
	}

	/* Function finds the year in a message and returns it. */
	private int parseForYear(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (Character.isDigit(letter)) {
				try {
					int year = Integer.parseInt(text.substring(i, i + 4));
					return year;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return -1;
	}

	/* Function finds the month in a message and returns it. */
	private int parseForMonth(String text) {
		if (text.contains("jan")) {
			return 1;
		} else if (text.contains("feb")) {
			return 2;
		} else if (text.contains("mar")) {
			return 3;
		} else if (text.contains("apr")) {
			return 4;
		} else if (text.contains("may")) {
			return 5;
		} else if (text.contains("jun")) {
			return 6;
		} else if (text.contains("jul")) {
			return 7;
		} else if (text.contains("aug")) {
			return 8;
		} else if (text.contains("sep")) {
			return 9;
		} else if (text.contains("oct")) {
			return 10;
		} else if (text.contains("nov")) {
			return 11;
		} else if (text.contains("dec")) {
			return 12;
		}
		return -1;
	}

	/*
	 * Function takes a year and month as an int and returns holiday information
	 * based on the year and if possible, month.
	 */
	private List<String> processHoliday(int year, int month) {
		HolidayService service = new HolidayService();
		List<String> messages = new ArrayList<>();
		try {
			List<Holiday> holidays = service.holidays(year);
			String result = null;
			// If statement to check if a month is given, if true, adds the holidays in the
			// month to
			// list
			if (month > 0) {
				for (Holiday holiday : holidays) {
					String holidayDate = holiday.getDate();
					int holidayMonth = Integer.parseInt(holidayDate.substring(5, 7));
					if (month == holidayMonth) {
						result = holiday.getName() + " Holiday occurs on " + holidayDate;
						messages.add(result);
					}
				}

				// If statement to check if no holidays were added to list, if true, string to
				// be returned states no holidays
				if (messages.isEmpty()) {
					// Switch block code to assign return message indicating no holidays based on
					// month
					switch (month) {
					case 1:
						result = "There are no holidays in January, " + year;
						break;
					case 2:
						result = "There are no holidays in February, " + year;
						break;
					case 3:
						result = "There are no holidays in March, " + year;
						break;
					case 4:
						result = "There are no holidays in April, " + year;
						break;
					case 5:
						result = "There are no holidays in May, " + year;
						break;
					case 6:
						result = "There are no holidays in June, " + year;
						break;
					case 7:
						result = "There are no holidays in July, " + year;
						break;
					case 8:
						result = "There are no holidays in August, " + year;
						break;
					case 9:
						result = "There are no holidays in September, " + year;
						break;
					case 10:
						result = "There are no holidays in October, " + year;
						break;
					case 11:
						result = "There are no holidays in November, " + year;
						break;
					case 12:
						result = "There are no holidays in December, " + year;
						break;
					}
					messages.add(result);
				}

			}

			// else block code to assign return message and number of holidays in a year
			else {
				result = "There are " + holidays.size() + " holidays for the year " + year;
				messages.add(result);
			}
		}

		// Catch block code to catch any errors invoking holiday methods, prints where
		// error occurs
		catch (Exception e) {
			System.out.println("Error in invoking holiday service");
			e.printStackTrace();
		}
		return messages;
	}

}