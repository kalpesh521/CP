package OOPs.Design_Pattern.Abstract_Design_Pattern;

public class AbdroidDevFactory extends  AbstractDesignPattern{
    @Override
    public Employee createEmployee() {
        return new Android();
    }
}
