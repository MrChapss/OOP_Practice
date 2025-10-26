package calcu_encap;
//one class = one purpose
//I'll encapsulate this class
class Calculator {
	
	private double firstNum;
	private double secondNum;
	private double result;
	
	//setters
	public void setFirstNum(double num1st) { 
		this.firstNum = num1st;
	}
	
	public void setSecondNum(double num2nd) { 
		this.secondNum = num2nd;
	}
	
	//getter
	public double getResult() {
		return result;
	}
	
	// arithmetic operators
	public void calculate(String operators) {
		switch (operators) {
			case "+" -> result = firstNum + secondNum;
			case "-" -> result = firstNum - secondNum;
			case "/" -> result = firstNum / secondNum;
			case "*" -> result = firstNum * secondNum;
		}
		if (operators.equals("/") && secondNum == 0) {
			System.out.println("NO SKIBIDI ZERO (0)"); 
		}
	}
	
	
}