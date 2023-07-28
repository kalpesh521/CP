package OOPs.OOPs.TypesOfClass;
//Nested class
class Outer {
    int x = 10;
    Inner in =new Inner(); // Can create object of inner class inside outer class everywhere
    class Inner {
        int y = 20;

        public void innerdisplay() { //Don't need to create object of outer class to access data members
            System.out.println("The value of x : " + x + " y : " + y);
        }
    }

    public void outerDisplay() {
        Inner i = new Inner(); // Can create inner class object in outer class anywhere
        System.out.println(i.y);
        i.innerdisplay();
     }
}


public class TypeOne {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();

     }
}
