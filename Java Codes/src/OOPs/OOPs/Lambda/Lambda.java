package OOPs.OOPs.Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
//Lambda function gvvgbg
public class Lambda {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

        arr.forEach((item) -> System.out.println(item * 2));
        System.out.println();

        Consumer<Integer> fun = (item) -> System.out.println(item * 3);
        arr.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;

        Lambda mycal = new Lambda();
        System.out.println("sum : "+mycal.operate(5,3,sum));
        System.out.println(mycal.operate(5,3,sub));
        System.out.println(mycal.operate(5,3,mul));
    }


    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }


}

interface Operation {
    int operation(int a, int b);
}