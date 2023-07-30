package OOPs.OOPs.JavaLangPackege;


import java.lang.*;
public class ObjectClass {
    public static void main(String[] args) {
        Object ob1 = new Object();
//        Object ob2 = new Objects;
        Object ob2 = ob1;
        System.out.println(ob1.equals(ob2));
        System.out.println(ob1.hashCode());
    }
}
