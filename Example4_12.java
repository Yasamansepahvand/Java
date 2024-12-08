import java.util.*;                                     //Line 1
public class Example4_12 {
    static Scanner console = new Scanner(System.in);    //Line 4

    public static void main(String[] args)              //LIne 5
    {                                                   //Line 6
        Clock myClock = new Clock(5, 4, 30);            //Line 7
        Clock yourClock = new Clock();                  //Line 8

        int hours;                                      //Line 9
        int minutes;                                    //Line 10
        int seconds;                                    //Line 11

        System.out.println("Line 12: myClock: "
                           + myClock);                  //Line 12

        System.out.println("Line 13: yourClock: "
                           + yourClock);                //Line 13

        yourClock.setTime(5, 45, 16);                   //Line 14

        System.out.println("Line 15: After setting "
                         + "the time, yourClock: "
                         + yourClock);                  //Line 15

        if (myClock.equals(yourClock))                  //Line 16
            System.out.println("Line 17: Both times "
                             + "are equal.");           //Line 17
        else                                            //Line 18
            System.out.println("Line 19: The two "
                             + "times are not equal");  //Line 19

        System.out.print("Line 20: Enter the hours, "
                       + "minutes, and seconds: ");     //Line 20

        hours = console.nextInt();                      //Line 21
        minutes = console.nextInt();                    //Line 22
        seconds = console.nextInt();                    //Line 23
        System.out.println();                           //Line 24

        myClock.setTime(hours,minutes,seconds);         //Line 25

        System.out.println("Line 26: New time of "
                         + "myClock: " + myClock);      //Line 26

        myClock.incrementSeconds();                     //Line 27

        System.out.printf("Line 28: After incrementing "
                        + "the clock by one second, "
                        + "myClock: %s%n", myClock);    //Line 28

        yourClock.makeCopy(myClock);                    //Line 29
        System.out.println("Line 30: After copying "
                         + "myClock into yourClock, "
                         + "yourClock: " + yourClock);  //Line 30
    }//end main                                         //Line 31

}
