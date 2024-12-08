import java.util.*;
public class Example2_9 {
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args){
		String firstName, lastName, line;
		int age;
		double weight;
		System.out.print("Enter first name, last name , "
				       + "age, and weight separted by space :");
		line = console.nextLine(); // read a line
		System.out.println("line is: " + line);

		System.out.print("Enter first name, last name , "
			       + "age, and weight separted by space :");
		firstName = console.next();
		lastName = console.next();
		age = console.nextInt();
		weight = console.nextDouble();
		System.out.println("Name : " + firstName + " " + lastName);
		System.out.println("Age : " + age);
		System.out.println("Weight : " + weight);
	}

}
