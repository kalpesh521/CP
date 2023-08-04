
package DSA.StackAndQueue;

import java.util.Stack;

public class PrefixToInfix {
    // Java program to find infix for a given prefix.


    static boolean isOperand(char x) {
        return (x >= 'a' && x <= 'z') ||
                (x >= 'A' && x <= 'Z');
    }

    // Get Infix for a given  prefix expression

    static String getInfix(String exp) {
        Stack<String> s = new Stack<String>();

        for (int i = exp.length()-1; i>=0; i--) {
            // Push operands
            if (isOperand(exp.charAt(i))) {
                s.push(exp.charAt(i) + "");
            }

            // We assume that input is
            // a valid  prefix and expect
            // an operator.
            else {
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();                  // Operator
                s.push("(" + op1 + exp.charAt(i) + op2 + ")");
            }
        }

        // There must be a single element
        // in stack now which is the required
        // infix.
        return s.peek();
    }

    // Driver code
    public static void main(String args[]) {
        String exp = "*-A/BC-/AKL";
        System.out.println(getInfix(exp));
    }
}
// ((A-(B/C))*((A/K)-L))

