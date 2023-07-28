package OOPs.OOPs.TypesOfClass;

class OuterLocal{
    //can't access  inner class, create object outside of the display method
    public  void display(){
        class Inner{
            void  show(){
                System.out.println("Hello");
            }
        }
        new  Inner().show(); //created Object ,call method
    }
}
public class LocalClass {
    public static void main(String[] args) {
        OuterLocal ol =new OuterLocal();
        ol.display();
    }
}
