import org.jibble.pircbot.*;

public class MyBotMain {

	private static final String NAME = "KevinBot";
	private static final String SERVER = "irc.freenode.net";
	private static final String CHANNEL = "#pircbot";

	public static void main(String[] args) throws Exception {

		// Now start our bot up.
		MyBot bot = new MyBot(NAME);

		// Enable debugging output.
		bot.setVerbose(true);

		// Connect to the IRC server.
		bot.connect(SERVER);

		// Join the #pircbot channel.
		bot.joinChannel(CHANNEL);

		// announcing
		bot.sendMessage(CHANNEL, "Hello!");
	}

}