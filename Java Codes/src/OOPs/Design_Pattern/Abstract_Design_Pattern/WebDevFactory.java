package OOPs.Design_Pattern.Abstract_Design_Pattern;

public class WebDevFactory extends AbstractDesignPattern{

    @Override
    public Employee createEmployee() {
        return new Web();
    }
}
