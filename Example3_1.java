import java.util.*;
public class Example3_1 {
   static Scanner console = new Scanner(System.in);
   static public void main(String[] args){
	   int x, i, sum = 0;
	   double ave;
	   for(i = 0; i < 5; i++){
		   System.out.print("Enter number "+ (i + 1) + ":");
		   		x = console.nextInt();
		   		sum += x;
	   }
       ave = (double) sum / 5;
       System.out.printf("Average is : %5.2f", ave);
   }
}
