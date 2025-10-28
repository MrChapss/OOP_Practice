package inheritance_sigma;
import java.util.Scanner;

public class Zoo_System {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Lion lion = new Lion();
		Cat cat = new Cat();
		
		System.out.print("What's the name of the Lion?: ");
		lion.setName(input.nextLine());
		
		System.out.print("What's the name of the Cat?: ");
		cat.setName(input.nextLine());
		
		System.out.printf("%nThe name of the lion is %s", lion.getName());
		
		System.out.printf("%nThe name of the Cat is %s%n%n", cat.getName());
		
		lion.Stop();
		cat.Eat();
	}
}
