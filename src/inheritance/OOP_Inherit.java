package inheritance;
import java.util.Scanner;

public class OOP_Inherit {
	public static void main(String[] args) {
		// declare the scanner
		Scanner input = new Scanner(System.in);
		// create an object from the class
		Questions question = new Questions();
		Results output = new Results();
		Car myCar1 = new Car();
	
		 
		//Baicycle myBike1 = new Baicycle();
		
		// 1st Question
		question.askingName();
		myCar1.setName(input.nextLine());
		
		// 2nd Question
		question.askingColor();
		myCar1.setColor(input.nextLine());
		
		// 3rd Question
		question.askingSpeed();
		myCar1.setSpeed(input.nextInt());
		
		// printing the output
		output.nameOfCar(myCar1.getName());
		output.colorOfCar(myCar1.getColor());
		output.speedOfCar(myCar1.getSpeed());
		
		// closing the scanner
		input.close();

	}
}
