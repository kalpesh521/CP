package OOPs.OOPs.JavaLangPackege;

import java.io.FileOutputStream;
import java.lang.reflect.Field;

class My {
    String name;

    public void My(){
        System.out.println("Hello");
    }

    public  void My(String name){
        this.name= name;
    }

    public  void  display(){
        System.out.println("Hello"+this.name);
    }
}
public class ReflectPackage {
    public static void main(String[] args) {
        Class c= My.class;
        Field field []=c.getDeclaredFields();
        // We can get all the fields , constructor , methods
        for(Field a :field){
            System.out.println(a);
        }


    }
}
