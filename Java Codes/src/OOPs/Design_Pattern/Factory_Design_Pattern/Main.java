package OOPs.Design_Pattern.Factory_Design_Pattern;
public class Main {
    public static void main(String[] args) {
        Employee emp = Employeefactory.getEmployee("Web Developer");
        System.out.println(emp.salary());
    }
}
