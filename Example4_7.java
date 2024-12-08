public class Example4_7                          //line 1
{                                                //line 2 
     public static void main(String[] args)      //line 3 
     {                                           //line 4 
    	 staticTest object1 = new staticTest(3); //line 5
    	 staticTest object2 = new staticTest(5); //line 6
    	 System.out.println("line 7 : object1 :"
    			 + object1);                     //line 7
    	 System.out.println("line 8 : object2 :"
     			 + object2);                     //line 8
    	 System.out.println("line 9 : increment count "
    			 + "using the class") ;          //line 9
         staticTest.incrementCount();  	         //line 10
    	 System.out.println("line 11 : object1 :"
    			 + object1);                     //line 11
    	 System.out.println("line 12 : object2 :"
     			 + object2);                     //line 12
    	 System.out.println("line 13 : increment count "
    			 + "using object1") ;            //line 13
    	 object1.incrementCount();   //not good  //line 14
    	 System.out.println("line 15 : object1 :"
    			 + object1) ;                    //line 15
    	 System.out.println("line 16 : object2 :"
    			 + object2) ;                   //line 16
    	 System.out.println("line 17 : increment count "
    			 + "using object2") ;            //line 17
    	 object2.incrementCount(); // not good   //line 18
    	 System.out.println("line 19 : object1 :"
    			 + object1);                     //line 19
    	 System.out.println("line 20 : object2 :"
     			 + object2);                     //line 20
    	 object1.setX(10);                       //line 21
    	 System.out.println("line 22 : object1 :"
    			 + object1);                     //line 22
    	 System.out.println("line 23 : object2 :"
     			 + object2);                     //line 23
     }                                           //line 24 
}                                                //line 25
