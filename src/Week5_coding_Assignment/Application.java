package Week5_coding_Assignment;

public class Application {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		
		logger.log("Hello");
		logger.error("Ooops, this is an error");
		logger2.log("Hello" + "\r\n");
		logger2.error("Ooops, this is an error" + "\r\n");
	}

}
