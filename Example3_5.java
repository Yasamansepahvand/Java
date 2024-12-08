import java.util.*;
public class Example3_5 {
    static Scanner in = new Scanner(System.in); 
	public static void main(String[] args){
		int x;
		System.out.print("Enter an integer number : ");
		x = in.nextInt();
		System.out.println("Number = " + x + "Factorial = " + fact(x));
	}
	public static long fact(int x){
		long f = 1;
		for(int i = 2; i <= x; i++)
			f *= i;
		return f;
	}

}
