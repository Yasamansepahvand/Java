
public class Example4_10 {
    public static void main(String[] args)
    {
    	Change c = new Change();
    	int a = 100;
    	int b = 200;
    	c.setXY(a, b);
        System.out.println("Before change the numbers:");
        c.show();
    	c = changeMethod(c);
        System.out.println("After change the numbers:");
        c.show();
    }
    //***************
    public static Change changeMethod(Change c)
    {
    	c.switcNumbers();
    	return c;
    }

}
