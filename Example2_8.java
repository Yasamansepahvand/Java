import java.util.*;
public class Example2_8 {
	static Scanner input = new Scanner(System.in); 
	static  final float PVALUE = 3.14f; 
	public static void main(String[] args){
		float r, p, s;
		System.out.print("Enter the radius : ");
		r = input.nextFloat();
		s = PVALUE * r * r;
		p = 2 * PVALUE * r; 
		System.out.printf("p = %5.2f, s = %.2f", p, s);
		
	}

}
