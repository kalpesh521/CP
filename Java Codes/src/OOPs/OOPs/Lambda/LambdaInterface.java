package OOPs.OOPs.Lambda;

import javax.swing.plaf.IconUIResource;

@FunctionalInterface
interface MyLambda {
    public void display(String s);
}

class Demo {
    int count2 = 2; //Can be access in lambda Expression

    public void method1() {
        int count = 1; // final can be access , can;t increment;
        MyLambda ml = (s) -> {
            int count1 = 0; //Can declare variable in lambda expression
            System.out.println("Hello" + count2);
        };
//        count++;
    }


}

public class LambdaInterface {

    static void reverse(String s1){
        StringBuffer sb = new StringBuffer(s1);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        MyLambda m = (s) -> {
            System.out.println(s);
        };
        m.display("Hello World");

        MyLambda m1 = System.out::println; // Call to display method in interface
        m1.display("Hello Kalpesh");

        MyLambda rev =LambdaInterface::reverse;
        rev.display("Kalpesh");
    }

}
