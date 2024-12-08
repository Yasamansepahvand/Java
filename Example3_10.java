import java.util.*;
public class Example3_10 {
    static Scanner in = new Scanner(System.in); 
	public static void main(String[] args){
	      double grade;
	      System.out.print("Enter the student's grade:");
	      grade = in.nextDouble();
	      System.out.println("grade = " + grade + ", order = " + change(grade));
	   }
	   //*************************
	   public static char change(double grade)
	   {
	      char order;
	      if(grade >= 17 && grade <= 20)
	          order = 'A';
	      else
	          if(grade >= 15 && grade <17)
	             order = 'B';
	          else
	             if(grade >= 12 && grade < 15)
	               order = 'C';
	             else
	               order = 'D';
	      return order;
	   }
	
}
