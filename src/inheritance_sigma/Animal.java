package inheritance_sigma;

public class Animal {
	protected String name;
	protected String color;
	protected String size;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getSize() {
		return size;
	}
	
	// actions
	public void Eat() {
		System.out.println("This animal is eating");
	}
	
	public void Drink() {
		System.out.println("This animal is drink");
	}
	
	public void Run() {
		System.out.println("This animal is running");
	}
	
	public void Stop() {
		System.out.println("This animal stop its movement");
	}
	
}
