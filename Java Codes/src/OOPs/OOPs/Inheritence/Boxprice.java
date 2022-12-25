package OOPs.OOPs.Inheritence;

public class Boxprice extends Boxweight {

    double cost;

    Boxprice() {

        this.cost = -1;
    }

    public Boxprice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}

