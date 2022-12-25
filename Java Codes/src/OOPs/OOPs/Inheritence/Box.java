package OOPs.OOPs.Inheritence;
//Base class
public class Box {
    double l;
    double b;
    double h;

    Box() {
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    Box(double side) {
        this.l = side;
        this.b = side;
        this.h = side;
    }
//Parameterize constructor with three parameter
    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
//Copy constructor
     Box(Box old){
        this.l= old.l;
        this.b= old.b;
        this.h= old.h;
     }

}
