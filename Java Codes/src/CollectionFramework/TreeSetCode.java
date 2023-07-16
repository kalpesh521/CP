package CollectionFramework;

import java.util.*;

class Point implements Comparable {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "X=" + x + " Y=" + y;
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point) o;
        if (this.x < p.x) {
            return -1;
        } else if (this.x > p.x) {
            return 1;
        } else {
            if (this.y < p.y) {
                return -1;
            } else if (this.y > p.y) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    /*
    * The Point class is a custom class representing a point in a two-dimensional space.
    * It implements the Comparable interface to define a natural ordering for objects of this class.
    * The compareTo method in the Point class is used to compare two Point objects based on their x and y coordinates.
    * It returns a negative value if the current object is less than the argument, a positive value if it's greater,
    *  and 0 if they are equal.
    **/
}

public class TreeSetCode {
    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1, 1));
        ts.add(new Point(5, 3));
        ts.add(new Point(5, 2));
        System.out.println(ts);
    }
}
