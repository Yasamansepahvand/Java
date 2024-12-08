import java.util.*;
public class Example2_12 {
	 static Scanner in = new Scanner(System.in);
     public static void main(String[] args){
    	 int num1, num2, sum;
    	 System.out.print("Enter two numbers: ");
    	 num1 = in.nextInt();
    	 num2 = in.nextInt();
    	 sum = sumSqr(num1, num2);
    	 System.out.print("In main sum = " + sum);
     }
     public static int sumSqr(int a, int b){
    	 int s;
    	 s = a * a + b * b;
    	 return s;
     }
}
