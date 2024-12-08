
public class Example2_2 {
    public static void main(String[] args){
    	long salary = 1000000;
    	double tax, netSalary;
    	tax = salary * 10 / 100;
    	netSalary = salary - tax;
    	System.out.print("Your salary is : \t" + salary );
    	System.out.println();
    	System.out.println("Tax of salary is : \t" + tax );
    	System.out.print("Your net salary is : \t" + netSalary );
    }
}
