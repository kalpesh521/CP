package OOPs.OOPs.Generics;

import java.util.Arrays;

public class CustomArraylist {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArraylist() {
        this.data = new int[DEFAULT_SIZE];
    }

    void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public boolean isFull() {
        return size == data.length;
    }

    //copy the current items in new array(temp)
    void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];

        }
        data = temp;

    }

    public int removed() {
        int removed = data[size--];
        return removed();
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArraylist list =new CustomArraylist();
//        list.add(6);
//        list.add(8);
//        list.add(11);

        for (int i=0;i<15   ;i++){
            list.add(i*2);
        }
        System.out.println(list);
    }
}
