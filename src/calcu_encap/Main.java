package calcu_encap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// declare the scanner
		Scanner input = new Scanner(System.in);
		// create an object from the class
		Calculator methods = new Calculator();
		RetryFunc retry = new RetryFunc();
		
		
		do {
			System.out.print("Enter a number: ");
			methods.setFirstNum(input.nextDouble());
			
			System.out.print("Enter the 2nd number: ");
			methods.setSecondNum(input.nextDouble());
			
			System.out.print("Choose from (+ , -, *, /): ");
			methods.calculate(input.next());
			
			System.out.println(methods.getResult());
			
			System.out.print("Input 'exit' to stop: ");
			retry.setTryAgain(input.next());
			
		} while (retry.tryAgain(retry.getTryAgain()));
		
		input.close();
	}
}



