package OOPs.OOPs.Inheritence;

import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(5);
        Box box2 = new Box(3, 5, 6);
        Box box3 = new Box(box2);
        System.out.println(box1.l + " " + box1.b + " " + box1.h);
        System.out.println(box2.l + " " + box2.b + " " + box2.h);
        System.out.println(box3.l + " " + box3.b + " " + box3.h);

        //calling child class
        Boxweight bwt = new Boxweight(2, 3, 1, 4);
        System.out.println(bwt.l + " " + bwt.weight);

        Box bwt2 = new Boxweight(2, 3, 1, 4);
        System.out.println(bwt.l + " " + bwt.weight);

        //child class referenced to parent class
/*
        Boxweight bwt3=new Box(2,3,1);
        System.out.println(bwt.l+" "+bwt.weight);

        Boxweight bwt4=new Box(2,3,1);
        System.out.println(bwt.l+" "+bwt.h);
 */

        //Multilevel inheritence
        Boxprice obj = new Boxprice(2, 34, 41);
        System.out.println(obj.weight + " " + obj.cost);
    }
}
