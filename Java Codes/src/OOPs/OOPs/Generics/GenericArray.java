package OOPs.OOPs.Generics;
// Generic
class My<T> {
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }

}

// Generic Bounding
//class A {
//}
//
//class B extends A {
//}
//
//interface c {
//};

class MyArray<T extends Number> {  // Here , we can extend class A as well as interface c , we can only use extend
    // keyword , not implements
    T B[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        B[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(B[i]);
        }
    }

}

public class GenericArray {


    public static void main(String[] args) {
//      My <Integer> m = new My<>();//Only Integer
        My m = new My<>(); // If no parameter passed i t will passed as a object
        m.append(25);
        m.append("Hi");
        m.append(15);
        m.display();

        MyArray<Integer> ma = new MyArray<>(); // Extend number , only number data type can use
//      MyArray <String> ma = new MyArray<>(); // Can't use String




    }
}
