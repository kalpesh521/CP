package OOPs.OOPs.StaticExamples;

public class InnerClass {

    /*
    // can't create inner class
    class newClass{

    }
    */


    //We can create static class in another class
    static class Test {
        String name;

        Test(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }

    }

    public static void main(String[] args) {
        //We can get output because both class are static
        Test obj1 = new Test("Kalpesh");
        Test obj2 = new Test("Kunal");
        System.out.println(obj1.name);
        System.out.println(obj2.name);
        //System.out.println(obj1);
    }
}

/*
// Can't create static class outside
static class NewClass{

}
*/

/*
//We can create class outside another class
class NewClass{

}
 */