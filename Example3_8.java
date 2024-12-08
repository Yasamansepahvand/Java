import java.util.*;
public class Example3_8 {
    static Scanner in = new Scanner(System.in); 
	public static void main(String[] args){
		int hoursWorked, rate;
		System.out.print("Enter hourse and rate :");
		hoursWorked = in.nextInt();
		rate = in.nextInt();
		calculate(hoursWorked, rate);
	}
	//*************************
	public static void calculate(int hoursWorked, int rate){
		long regularPay;
		double overtimePay = 0;
		if(hoursWorked > 40){
			regularPay = 40 * rate;
			overtimePay = (hoursWorked - 40) * 1.5 * rate;
		}
		else
			regularPay = hoursWorked * rate;
		System.out.println("Regular Pay is :" + regularPay);
		System.out.println("Overtime pay is :" + overtimePay);
		System.out.println("Total Pay is :" + (overtimePay + regularPay));
		
	}
}
