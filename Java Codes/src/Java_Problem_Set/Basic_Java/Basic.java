package Java_Problem_Set.Basic_Java;
//star
import java.math.BigInteger;
import java.util.Scanner;
//
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

        Scanner sc = new Scanner(System.in);
       /* System.out.println("Enter Temperature in fahr");
        int temperature = sc.nextInt();
        temperature=((temperature-32)*5)/9;
        System.out.println("temperture in celcius is "+temperature);
        */
        //==================================================================================

        //Swap Numbers without using 3rd variables
        /*
        int x = 5;
        int y = 4;

        System.out.println(x + " " + y);
        x = x + y; // x = 5 + 4 = 9
        y = x - y; // y = 9 - 4 = < 5 >
        x = x - y; // x = 9 - 5 = < 4 >
        System.out.println(x + " " + y);
        */

        //==================================================================================

        // Programs to add two numbers ,not for large numbers upto int
       /* int number1, number2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first large number");
        number1 = in.nextInt();
        System.out.println("Enter second large number");
        number2 = in.nextInt();

        System.out.println(number1 + number2);
        */
        // Program to add two large numbers
         /*
        String number1, number2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first large number");
        number1 = in.nextLine();
        System.out.println("Enter second large number");
        number2 = in.nextLine();

        System.out.println();
        BigInteger first = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        BigInteger sum;

        sum = first.add(second);
        System.out.println("Result of addition = " + sum);
        */

        //==================================================================================

/*
        // Program to find factorial of large number
        int n, c;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer");
        n = input.nextInt();
        for (c = 1; c <= n; c++) {
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }
        System.out.println(n + "! = " + fact);
        */
        //==================================================================================
        //Comparision of two string
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first String");
        String s1 = in.nextLine();
        System.out.println("Enter second String");
        String s2 = in.nextLine();

        if (s1.compareTo(s2) > 0) {
            System.out.println("First string is greater than second ");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("Second string is greater than first");
        } else {
            System.out.println("Both strings are equal");
        }*/

        //==================================================================================

        /*//reverse number
        int n ,reverse = 0;
        n = 123;
        while(n!=0){
            reverse = reverse *10;
            reverse = reverse + (n%10);
            n=n/10;

        }
        System.out.println("reverse number is "+reverse);
        */

    }
}
