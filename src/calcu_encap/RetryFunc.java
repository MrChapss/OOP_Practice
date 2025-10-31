package calcu_encap;

public class RetryFunc {
	private String userInput;
	
	public void setTryAgain(String userInput) {
		this.userInput = userInput;
		
	}
	
	public String getTryAgain() {
		return userInput;
	}

	public Boolean tryAgain(String input) {
		if(input.equalsIgnoreCase("exit")) {
			System.out.println("Exiting...");
			return false;
		} else {
			return true;
		}
		
	}
}
