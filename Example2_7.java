import java.util.*;
public class Example2_7 {
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args){
		int x, y, perime, area;
		System.out.print("Enter length, width :");
		x = console.nextInt();
		y = console.nextInt();
		perime = (x + y) * 2;
		area = x * y;
		System.out.printf("Perime = %d, area = %d", perime, area);
	}

}
