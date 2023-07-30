package OOPs.OOPs.MultiYhreading;

 class  My1 implements Runnable   {

        public void run() { // In built method
            int i = 1;
            while (true) {
                System.out.println(i + "Hello");
                i++;
            }
        }
    }

    public class RunnableInteface {
        public static void main(String[] args) {
            My1 rn = new My1() ; //Cart  call run method abstract
            Thread t = new Thread(rn);//Horse
            t.start();
            int i = 1;
            while (true) {
                System.out.println(i + "Kalpesh");
                i++;
            }
        }
    }


