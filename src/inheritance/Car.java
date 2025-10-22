package inheritance;
// one class = one purpose
// the purpose of this "car" is to store the data or value? ball it
// I'll encapsulate this class
class Car {

	private String name;
	private String color;
	private int speed;
	
	// setter and setting rules and typshi
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setSpeed(int speed) {
		if (speed < 0) {
			System.out.println("Speed cannot be lower than 0! Default is 0");
		} else {
			this.speed = speed;
		}
	}

	// getter or return the value
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	// methods and stuff (i'll tinker this later)
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
