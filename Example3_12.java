import java.util.*;
public class Example3_12 {
	static Scanner in = new Scanner(System.in);
	   public static void main(String[] args) 
	   {
	      int num, count1 = 0, count2 = 0;
	      while(true)
	      {
	         System.out.print("Enter an int number:");
	         num = in.nextInt();
	         if (num == 0)
	            break;
	         if(num % 2 == 0)
	            count1 ++;
	         else
	            count2 ++;
	       }
	       System.out.println("Even = " + count1 + ", Odd = " + count2);
	   }

}
