package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class Hashcode {

    public static void main(String[] args) {

        Set<Student> std=new HashSet<>();
        std.add( new Student("Kalpesh",25));
        std.add( new Student("Suraj",15));
        std.add( new Student("Rajat",25));
        std.add( new Student("Durgesh",45));
        //It is printing name student having same roll no ,
        //so,We have to use equals and hashcode method in Student Class
        System.out.println(std);

    }
}
