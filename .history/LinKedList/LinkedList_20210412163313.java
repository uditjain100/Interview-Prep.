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

    public int size;

    public LinkedList() {
        this.root = null;
        this.tail = null;
        this.size = 0;
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
        this.size++;
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
        this.size++;
    }

    public void addAt(int idx, int data) {
        if (idx == 0)
            this.addFirst(data);
        else if (idx >= this.size)
            this.addLast(data);
        else {
            Node nn = new Node(data);
            Node prev = this.getAt(idx - 1);
            Node nxt = prev.next;
            prev.next = nn;
            nn.next = nxt;
            this.size++;
        }
    }

    public Node getFirst() {
        return this.root;
    }

    public Node getLast() {
        return this.tail;
    }

    public Node getAt(int idx) {
        if (idx == 0)
            return this.getFirst();
        else if (idx >= this.size)
            return this.getLast();
        else {
            Node curr = this.root;
            while (idx-- > 0)
                curr = curr.next;
            return curr;
        }
    }

    public Node removeFirst() {
        if (this.root == null)
            return null;
        else {
            Node rn = this.root;
            this.root = this.root.next;
            return rn;
        }
    }

}
