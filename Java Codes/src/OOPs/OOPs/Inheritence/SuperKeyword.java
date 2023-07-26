package OOPs.OOPs.Inheritence;

import org.w3c.dom.css.Rect;

class Rectangle{
    int length,breadth;
    int x= 10;
    Rectangle(){
        System.out.println("Non-parameter constructor");
    }
    Rectangle(int length,int breadth){
        //Properties    Parameters
        this.length=length;
        this.breadth=breadth;
    }
}
class Cuboid extends Rectangle {
    int height;
    int x=20;
    Cuboid(int l,int b,int h){
        super(l,b);
        height=h;

    }
    int volume(){
        return length*breadth*height;
    }
    void display (){
        System.out.println(super.x); // Value of x from parent class
        System.out.println(x); // x of child class
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
     Cuboid cb=new Cuboid(10,20,30);
        System.out.println("Volume of cuboid : "+cb.volume());
        System.out.println();
        cb.display();
    }
}
