import java.util.*;
public class Example3_13 {
	static Scanner in = new Scanner(System.in);
	   public static void main(String[] args) 
	   {
	         boolean done = true;
	         int lampWatt, price;
	         while(done)
	         {
	            System.out.print("Enter the  lamp watt:");
	            lampWatt = in.nextInt();
	            switch(lampWatt)
	            {
	               case 40:
	                     price = 1000;
	                     System.out.println("Watt = " + lampWatt + " Price = " + price);
	                     break;
	               case 60:
	                     price = 1200;
	                     System.out.println("Watt = " + lampWatt + " Price = " + price);
	                     break;
	               case 75:
	                     price = 1500;
	                     System.out.println("Watt = " + lampWatt + " Price = " + price);
	                     break;
	               case 100:
	               case 150:
	                     price = 1800;
	                     System.out.println("Watt = " + lampWatt + " Price = " + price);
	                     break;
	               case 200:
	                     price = 2500;
	                     System.out.println("Watt = " + lampWatt + " Price = " + price);
	                     break;
	               default:
	                     System.out.println("The value of watt is illegal.");
	                     done = false;
	            }//end of switch
	     }//end of while

	   }

}
