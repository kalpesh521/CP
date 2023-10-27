package OOPs.Design_Pattern.Singleton;

import java.lang.reflect.Constructor;

public class Example {

    public static void main(String[] args) throws Exception {

        // create same hashcode due to only one object creation    no-thead safe
        System.out.println(Samosa.getsamosa().hashCode());
        System.out.println(Samosa.getsamosa().hashCode());

        // Thread Safe get object creation
        System.out.println(Samosa.getjalebi().hashCode());
        System.out.println(Samosa.getjalebi().hashCode());

        //creation of second object
        // Reflecton API to break singleton pattern
        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);// private to public
        Samosa s2 = constructor.newInstance();
        System.out.println(s2.hashCode());

     }
}
