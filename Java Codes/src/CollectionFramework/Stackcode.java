package CollectionFramework;

import java.util.Stack;

public class Stackcode {

    public static void main(String[] args) {
        Stack<String> animals = new Stack<>() ;
        animals.push("Lion");
        animals.push("cat");
        animals.push("dog");
        animals.push("tiger");

        System.out.println(animals);

        System.out.println(animals.peek());

        System.out.println(animals.pop());

        System.out.println(animals.peek());
    }
}
