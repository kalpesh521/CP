package DSA.Stack;

public class CustomStack {
    int ptr = -1;
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack() {
        this(DEFAULT_SIZE); //Calling to another constructor
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {

        if (isFull()) {
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop from empty stack");
        }
        return data[ptr--];
    }
  public int peek() throws Exception {
      if (isEmpty()) {
          throw new Exception("Cannot  peek from empty stack");
      }
        return data[ptr];
  }
    public boolean isFull() {
        return ptr == data.length - 1;

    }

    private boolean isEmpty() {
        return ptr == -1;
    }

}
