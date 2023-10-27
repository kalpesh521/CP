package OOPs.Design_Pattern.Abstract_Design_Pattern;

public class EmployeeFactory {

    public  static  Employee getEmployee(AbstractDesignPattern factory){
        return factory.createEmployee();
    }

}
