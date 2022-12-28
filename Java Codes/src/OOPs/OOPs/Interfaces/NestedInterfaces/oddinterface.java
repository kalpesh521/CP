package OOPs.OOPs.Interfaces.NestedInterfaces;

public class oddinterface {

    public interface  A {
        boolean isOdd(int num );
    }
}

class  B implements  oddinterface.A{
    @Override
    public boolean isOdd(int num) {
         return  (num & 1)==1;
    }
}