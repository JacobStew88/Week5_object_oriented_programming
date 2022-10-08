package Week5_coding_Assignment;

import java.util.Date;

public class Consolelogger implements Logger {

	
	public void log(String log) {
		Date date = new Date();
		System.out.println(date.toString() + ": " + log);
	}

	
	public void error(String error) {
		Date date = new Date();
		System.err.println(date.toString() + ": Error - " + error);
	}

}
