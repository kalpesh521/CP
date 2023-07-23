package DSA.StackAndQueue;

public class Dyanamicstack extends CustomStack {
    Dyanamicstack dst = new Dyanamicstack();

    public Dyanamicstack() {
        super();
    }

    public Dyanamicstack(int size) {
        super(size);

    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp = data;
            }
            data = temp;
        }
        return super.push(item);
    }
}

