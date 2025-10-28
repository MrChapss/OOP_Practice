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
			
			// ill fix this later(I will add a method in RetryFunc)
			System.out.print("Do you wanna break from the ads? input 'stop': ");
			retry.setUserRetry(input.next());
			
		} while (!retry.getUserRetry().equalsIgnoreCase("stop"));
		
		System.out.println(methods.getResult());
		
		input.close();
	}
}



