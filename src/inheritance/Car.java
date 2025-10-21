package inheritance;
import java.util.*;

class Car {
	Scanner input = new Scanner(System.in);
	
	String name;
	String color;
	int speed;
	
	public void start() {
		System.out.println("The car is moving!");
	}
	
	public void stop() {
		System.out.println("The car stop");
	}
	
	public void honk() {
		System.out.println("beep beep!");
	}
	
	public void accelerate() {
		System.out.println("The car is accelerating!");
	}
	
	
}
