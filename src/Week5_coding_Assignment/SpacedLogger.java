package Week5_coding_Assignment;

public class SpacedLogger implements Logger {

	
	public void log(String log) {
		for (int i = 0; i<log.length(); i++) {
			System.out.print(log.charAt(i));
			System.out.print(" ");
		}
	} 

	
	public void error(String error) {
		System.err.print("ERROR: ");
		for (int i = 0; i<error.length(); i++) {
			
			System.err.print(error.charAt(i));
			System.err.print(" ");
		}
	}
}
