package DSA.StackAndQueue;

public class CustomQueue {
    int end;
    protected int data[];

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {
        if (isFull()) {
            return  false;
        }
        data[end++] = item;
        return  true;
    }

    public  int remove() throws Exception{
        if(isEmpty()){
            throw  new Exception("Queue is Empty");

        }
        int removed= data[0];
        //Shift of elements in left
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }

    public int front() throws  Exception{
        if(isEmpty()){
            throw  new Exception("Queue is Empty");
        }
        return  data[0];
    }

    public void display(){
        for (int i=0;i<end;i++){
            System.out.print(data[i]+" <-");
        }
        System.out.println("END");
    }
    public boolean isFull() {
        return end == data.length - 1;

    }

    private boolean isEmpty() {
        return end == -1;
    }
}
