import java.util.ArrayList;

public class Stack<E> {

    ArrayList<E> arr;
    int tos;

    public Stack() {
        this.arr = new ArrayList<>();
        this.tos = -1;
    }

    public E push(E item) {
        return item;
    }

    public synchronized E pop() {
        E obj;
        int len = size();

        obj = peek();

        return obj;
    }

    public synchronized E peek() {
        int len = size();

        return elementAt(len - 1);
    }

    public boolean empty() {
        return size() == 0;
    }

}
