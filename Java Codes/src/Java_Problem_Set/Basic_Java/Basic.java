package Java_Problem_Set.Basic_Java;

import java.util.Scanner;

public class Basic {

    // Command Line Argument in Java is the information that is passed to the program
    // when it is executed. The information passed is stored in the string array passed to the main() method
    // and it is stored as a string. It is the information that directly follows the program’s name
    // on the command line when it is running.
    public static void main(String[] args) {
        //==================================================================================

        //Command Line Argument in java
       /* for(String t : args){
            System.out.println(t);
        }
        */

        //==================================================================================

        //Convert farhneight into celcius
        /*
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Temperature in fahr");
        int temperature = sc.nextInt();
        temperature=((temperature-32)*5)/9;
        System.out.println("temperture in celcius is "+temperature);
        */
        //==================================================================================

        //Swap Numbers without using 3rd variables
        int x = 5;
        int y = 4;

        System.out.println(x + " " + y);
        x = x + y; // x = 5 + 4 = 9
        y = x - y; // y = 9 - 4 = < 5 >
        x = x - y; // x = 9 - 5 = < 4 >
        System.out.println(x + " " + y);
    }
}
