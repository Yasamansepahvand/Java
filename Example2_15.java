public class Example2_15 {
    public static void main(String[] args) {
    	int number = 6;
    	System.out.print("In main before calling the method :");
    	System.out.println(" number = " + number);
    	printParameter(number);
    	System.out.print("In main after calling the method :");
    	System.out.println(" number = " + number);
    }
    public static void printParameter(int num) {
    	System.out.print("In method before changing :");
    	System.out.println(" num = " + num);
    	num = 20;
    	System.out.print("In method after changing :");
    	System.out.println(" num = " + num);
    }
}
