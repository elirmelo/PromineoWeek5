package week5;

public class App {

	public static void main(String[] args) {
		
		Logger asterisk = new AsteriskLogger();
		Logger space = new SpacedLogger();
		
		asterisk.Log("Promineo");
		asterisk.Error("Promineo");
		
		space.Log("Promineo");
		space.Error("Promineo");

	}

}
