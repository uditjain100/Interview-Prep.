public class LinkedList {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node root;
    public Node tail;

    public LinkedList() {
        this.root = null;
        this.tail = null;
    }

    public void addFirst(int data) {
        if (this.root = null) {
            this.root = new Node(data);
            this.tail = this.root;
        } else {
            Node nn = new Node(data);
            nn.next = this.root;
            this.root = nn;
        }
    }

    public void addLast(int data) {
        if (this.root = null) {
            this.root = new Node(data);
            this.tail = this.root;
        } else {
            Node nn = new Node(data);
            this.tail.next = nn;
            this.tail = nn;
        }
    }

    public void addAt(int idx, int data) {
        if (idx == 0)
            this.addFirst(data);
        else {
            Node nn = new Node(data);
            nn.next = this.root;
            this.root = nn;
        }
    }

}
