import java.util.*;
public class Example2_13 {
	 static Scanner in = new Scanner(System.in);
     public static void main(String[] args){
    	 int num1, num2, num3, max, min;
    	 System.out.print("Enter three numbers: ");
    	 num1 = in.nextInt();
    	 num2 = in.nextInt();
    	 num3 = in.nextInt();
    	 max = findMax(num1, num2, num3);//method call
    	 min = findMin(num1, num2, num3);//method call
    	 System.out.printf("max = %d,  min = %d", max, min);
     }
     //******************************
     public static int findMax(int x, int y, int z){
    	 int max;
    	 max = x > y ? x : y;
    	 max = max > z ? max : z;
    	 return max;
     }
     public static int findMin(int x, int y, int z){
    	 int min;
    	 min = x > y ? y : x;
    	 min = min > z ? z : min;
    	 return min;
     }

}
