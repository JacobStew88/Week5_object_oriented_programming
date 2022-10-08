package Week5_coding_Assignment;

public class AsteriskLogger implements Logger {

	
	public void log(String log) {
		System.out.print("***" + log + "***" + "\r\n");
	}

	
	public void error(String error) {
		System.err.print("***Error: " + error + "***" + "\r\n");
	}

}
