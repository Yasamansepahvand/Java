import java.util.*;
public class Example2_14 {
	 static Scanner in = new Scanner(System.in);
     public static void main(String[] args){
    	 double m1, m2, m3;
    	 int n1, n2, n3;
    	 System.out.print("Enter three double numbers: ");
    	 m1 = in.nextDouble();
    	 m2 = in.nextDouble();
    	 m3 = in.nextDouble();
    	 System.out.print("Enter three integer numbers: ");
    	 n1 = in.nextInt();
    	 n2 = in.nextInt();
    	 n3 = in.nextInt();
    	 System.out.println("Max Double is : " + findMax(m1, m2, m3));
    	 System.out.println("Max integer is : " + findMax(n1, n2, n3));
     }
     //********************************     
     public static double findMax(double x, double y, double z){
    	 double max;
    	 max = x > y ? x : y;
    	 max = max > z ? max : z;
    	 return max;
     }
     //********************************     
     public static int findMax(int x, int y, int z){
    	 int max;
    	 max = x > y ? x : y;
    	 max = max > z ? max : z;
    	 return max;
     }
     
}
