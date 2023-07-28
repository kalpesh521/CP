package OOPs.OOPs.TypesOfClass;

import java.io.ObjectStreamConstants;

class Outerstatic{
    int x=10;
    static  int y =20;
    static class inner{
        void show(){
            System.out.println("Hello from static "+y);
        }
    }
}
public class StaticClass {
    public static void main(String[] args) {
        Outerstatic.inner os = new Outerstatic.inner();
        os.show();
    }
}
