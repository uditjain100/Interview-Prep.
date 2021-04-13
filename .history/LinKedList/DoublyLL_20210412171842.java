public class DoublyLL {

    public class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    public Node root;
    public Node tail;

    public int size;

    public DoublyLL() {
        this.root = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(int data) {
        if (this.root == null) {
            this.root = new Node(data);
            this.tail = this.root;
        } else {
            Node nn = new Node(data);
            nn.next = this.root;
            this.root = nn;
            nn.next.prev = nn;
        }
        this.size++;
    }

    public void addLast(int data) {
        if (this.root == null) {
            this.root = new Node(data);
            this.tail = this.root;
        } else {
            Node nn = new Node(data);
            this.tail.next = nn;
            nn.prev = this.tail;
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
            nn.prev = prev;
            nn.next = nxt;
            nxt.prev = nn;
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
            if (this.root.next != null)
                this.root.next.prev = null;
            this.root = this.root.next;
            rn.next = null;
            this.size--;
            return rn;
        }
    }

    public Node removeLast() {
        if (this.root == null)
            return null;
        else {
            Node prev = this.getAt(size - 2);
            Node rn = prev.next;
            rn.prev = null;
            prev.next = null;
            this.size--;
            return rn;
        }
    }

    public Node removeAt(int idx) {
        if (idx == 0)
            return this.removeFirst();
        else if (idx >= this.size - 1)
            return this.removeLast();
        else {
            Node prev = this.getAt(idx - 1);
            Node rn = prev.next;
            Node nxt = rn.next;
            prev.next = nxt;
            nxt.prev = prev;
            rn.next = rn.prev = null;
            this.size--;
            return rn;
        }
    }

    public void display() {
        Node curr = this.root;
        System.out.println("*************************");
        while (curr != null) {
            System.out.print(curr.data + " => ");
            curr = curr.next;
        }
        System.out.println();
        curr = this.tail;
        while (curr != null) {
            System.out.print(curr.data + " => ");
            curr = curr.prev;
        }
        System.out.println();
        System.out.println("*************************");
    }

}
