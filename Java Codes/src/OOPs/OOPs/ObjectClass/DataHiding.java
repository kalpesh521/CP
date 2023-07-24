package OOPs.OOPs.ObjectClass;

public class DataHiding {

    private double length;//Can't access private properties , we need getter and setter method
    private double breadth;

    public double getlength(){ // Read properties
        return length;
    }

    public double getBreadth(){ //Write Properties
        return breadth;
    }

    public void setLength(double l){
         length = l;
    }
    public void setBreadth(double b){
          breadth = b;
    }

    public double area(){
        return length*breadth;
    }
    public static void main(String[] args) {

        DataHiding r =new DataHiding();
        r.setLength(3.5);
        r.setBreadth(5.2);
        System.out.println(r.area());
    }
}
