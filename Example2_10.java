import java.util.*;
public class Example2_10 {
	static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
    	int num1, num2, num3;
    	float average;
    	System.out.print("Enter three numbers: ");
    	num1 = in.nextInt();
    	num2 = in.nextInt();
    	num3 = in.nextInt();
    	average = (num1 + num2 + num3) / 3;
    	System.out.printf("without cast average = %5.2f" , average);
    	average = (float)(num1 + num2 + num3) / 3;
    	System.out.printf("\nwith cast average = %5.2f",  average);
    	
    }
}
