package OOPs.OOPs.ObjectClass;

public class ObjectClass {
    int num;
    float gpa;

    public ObjectClass(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    //Override Methods
    public ObjectClass() {
        super();
    }

    @Override
    public int hashCode() {
        return num;
    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }

    //Compare the content of obj
    @Override
    public boolean equals(Object obj) {
        return this.num==((ObjectClass)obj).num;
    }

//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //Returns String
    @Override
    public String toString() {
        return super.toString();
    }

    //finalize -> used in garbage collection
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass(23, 34.2f);
        ObjectClass obj1 = obj;
        ObjectClass obj2 = new ObjectClass(23, 34.2f);

//        System.out.println(obj.hashCode());
//        System.out.println(obj1.hashCode());

       if( obj.equals(obj2)){
           System.out.println("Obj is equal to obj2");
       }

        //Point these two object to same thing same as String
       if( obj == obj2){
           System.out.println("Obj is equal to obj2");
       }

        System.out.println( obj instanceof ObjectClass); //Check instance or not

        System.out.println(obj.getClass().getName());//return name of package


    }
}
