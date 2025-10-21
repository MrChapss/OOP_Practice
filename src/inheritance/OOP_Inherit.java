package inheritance;

public class OOP_Inherit {
	public static void main(String[] args) {
		// create an object from the class
		Questions question = new Questions();
		Results output = new Results();
		Car myCar1 = new Car();
		
		//update ko to bukas (matutulog na ako)
		Baicycle myBike1 = new Baicycle();
		
		// 1st Question
		question.askingName();
		myCar1.name = myCar1.input.nextLine();
		
		// 2nd Question
		question.askingColor();
		myCar1.color = myCar1.input.nextLine();
		
		// 3rd Question
		question.askingSpeed();
		myCar1.speed = myCar1.input.nextInt();
		
		// printing the output
		output.nameOfCar(myCar1.name);
		output.colorOfCar(myCar1.color);
		output.speedOfCar(myCar1.speed);

	}
}
