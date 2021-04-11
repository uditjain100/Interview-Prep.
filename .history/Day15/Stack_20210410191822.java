import java.util.ArrayList;

public class Stack<E> {

    ArrayList<E> arr;

    public Stack() {
        this.arr = new ArrayList<>();
    }

    public E push(E item) {
        this.arr.add(item);
        return item;
    }

    public E pop() {
        return arr.remove(arr.size() - 1);
    }

    public synchronized E peek() {
        int len = size();

        return elementAt(len - 1);
    }

    public boolean empty() {
        return size() == 0;
    }

}
