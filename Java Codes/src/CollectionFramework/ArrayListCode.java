package CollectionFramework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCode {
    public static void main(String[] args) {
        //create ArrayList
        ArrayList<String> name = new ArrayList();
        //Add element in list
        name.add("kp");
        name.add("sp");
        name.add("pp");
        System.out.println(name);

        ArrayList<String> newList = new ArrayList<>();
        newList.add("lk");
        newList.add("ab");
        newList.add(1, "ds");//add at index 1
        System.out.println(newList);

        //Merge list
        name.addAll(newList);
        System.out.println(name);

        //Remove element at index 2
        name.remove(2);
        System.out.println(name);

        //Remove element of value "ab"
        name.remove(String.valueOf("ab"));
        System.out.println(name);

        //Check element present or not
        System.out.println(name.contains("sp"));

        //Modify list
        name.set(2, "mn");
        System.out.println(name);

        //Clear list
        name.clear();
        System.out.println("Empty list" + name);

        //get to access element from list
        for (int i = 0; i < newList.size(); i++) {
            System.out.println("The element at index " + i + " is " + newList.get(i));
        }

//        for (String i : newList){
//            System.out.println("The element at index " + i+" is "+ newList.get(Integer.parseInt(i)));
//        }

        Iterator<String> it = newList.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator are " + it.next());
        }

        ArrayList<Integer> alt1 = new ArrayList<>(20);
        alt1.add(3);
        alt1.add(5);
        alt1.add(1);
        alt1.add(6);

        alt1.forEach((x) -> {
            System.out.print(x + " ");
        });

        alt1.forEach((n) -> show(n));
    }

    public static void show(int n) {
        if (n > 3) {
            System.out.print(n + " ");
        }
    }
}
