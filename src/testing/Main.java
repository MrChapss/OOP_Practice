package testing;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// declare the scanner
		Scanner input = new Scanner(System.in);
		// create an object from the class
		Calculator methods = new Calculator();
		
		for (int i=1; i<=1; i++) {
			System.out.print("Enter a number: ");
			methods.firstNum(input.nextInt());
			
			System.out.print("Enter the 2nd number: ");
			methods.secondNum(input.nextInt());
			// proceed na sa methods (add/sub/divde/mult)
			methods.MinusNum(methods.getFirstNum(), methods.getTotalNum());
		}
		System.out.println(methods.getFirstNum());
		
		input.close();
	}
}



