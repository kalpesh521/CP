package OOPs.Design_Pattern.Abstract_Design_Pattern;

public class Clientr {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AbdroidDevFactory());
        System.out.println(e1.name()) ;
        System.out.println(e1.salary());
    }
}
