package calcu_encap;

public class RetryFunc {
	private String userAnswer;
	// gagagwa ako ng method dto na mag loop (ito yung ilalagay ko sa while in do while)
	public void setUserRetry(String userInput) {
		this.userAnswer = userInput;
	}
	
	public String getUserRetry() {
		return userAnswer;
	}
	
	
	
}
