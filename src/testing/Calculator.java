package testing;
//one class = one purpose
//I'll encapsulate this class
class Calculator {
	
	private int firstNum;
	private int totalNum;
	
	//setters
	public void firstNum(int num1st) {
		this.firstNum = num1st;
	}
	
	public void secondNum(int num2nd) {
		this.totalNum = num2nd;
	}
	
	//getter
		public int getTotalNum() {
			return totalNum;
		}
		
		public int getFirstNum() {
			return firstNum;
		}
		
	// arithmetic operators
	public void AddNum(int num1st, int num2nd) {
		firstNum += totalNum;
	}
	
	public void MinusNum(int num1st, int num2nd) {
		firstNum -= totalNum;
	}
	
	public void MultiplyNum(int num1st, int num2nd) {
		firstNum *= totalNum;
	}
	
	public void DivideNum(int num1st, int num2nd) {
		firstNum /= totalNum;
	}
	
}