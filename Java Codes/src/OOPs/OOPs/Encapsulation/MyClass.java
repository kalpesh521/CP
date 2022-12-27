package OOPs.OOPs.Encapsulation;

public class MyClass {
    private  int num;
    String name ;

    public MyClass(int num, String name) {
        this.num = num;
        this.name = name;
    }


    //return private data member using getter method in case of encapsulation
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
