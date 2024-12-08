import java.util.*;
public class Example3_6 {
    static Scanner in = new Scanner(System.in); 
	public static void main(String[] args){
		int x, i = 0, sum = 0;
		System.out.print("Enter an integer number : ");
		x = in.nextInt();
		while(x != 0){
			sum += x * x;
			System.out.print("Enter an integer number : ");
			x = in.nextInt();
		}
		System.out.println("Sum of square is : " + sum);
		System.out.println("Number of numbers is : " + i);
	}
}
