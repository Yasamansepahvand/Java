import java.util.*;
public class Example3_14 {
	static Scanner in = new Scanner(System.in);
	 public static void main(String[] args) 
	 {
	      int x, y;
	      System.out.print("Enter the value of x:");
	      x = in.nextInt();
	      if(x == 0)
	         y = 10;
	       else
	         y = (5 * x * x) - (3 * x + 6);
	       System.out.println("x = " + x + ",y = " + y);
	  }
}
