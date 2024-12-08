
public class Example4_9 {
    public static void main(String[] args)
    {
    	Change c = new Change();
    	int a = 100;
    	int b = 200;
    	c.setXY(a, b);
        System.out.println("Before change the numbers:");
        c.show();
    	changeMethod(c);
        System.out.println("After change the numbers:");
        c.show();
    }
    //***************
    public static void changeMethod(Change c)
    {
    	c.switcNumbers();
    }
}
