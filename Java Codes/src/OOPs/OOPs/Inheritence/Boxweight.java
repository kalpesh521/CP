package OOPs.OOPs.Inheritence;

public class Boxweight extends  Box {
    double weight;

    Boxweight(){
        this.weight=-1;
    }

    public Boxweight(double l, double b, double h, double weight) {
        super(l, b, h);
        //Call the Box parent class constructor
        //Call to direct above class Ex.Object class in case of no parent class
        //initialize the values of parent class constructor
        this.weight = weight;
    }

    public Boxweight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
