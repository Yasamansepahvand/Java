import java.util.*;
public class Example2_11 {
	 static Scanner in = new Scanner(System.in);
     public static void main(String[] args){
    	 int num1, num2, num3;
    	 System.out.print("Enter three numbers: ");
    	 num1 = in.nextInt();
    	 num2 = in.nextInt();
    	 num3 = in.nextInt();
    	 findMax(num1, num2, num3);//method call
     }
     //******************************
     public static void findMax(int x, int y, int z){
    	 int max;
    	 max = x > y ? x : y;
    	 max = max > z ? max : z;
    	 System.out.print("in method max = " + max);
     }
}
