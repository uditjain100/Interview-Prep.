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
        if (this.root == null) {
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
        if (this.root == null) {
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
            prev.next = rn.next;
            this.size--;
            return rn;
        }
    }

    public Node midPoint() {
        if (this.root == null || this.root.next == null)
            return this.root;

        Node slow = this.root;
        Node fast = this.root;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void reverse() {
        if (this.root == null || this.root.next == null)
            return;

        Node prev = null;
        Node curr = this.root;
        Node next = curr.next;

        while (curr.next != null) {
            curr.next = prev;

            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;

        prev = this.root;
        this.root = this.tail;
        this.tail = prev;
    }

    public Node customReverse(Node head) {
        if (head == null || head.next == null)
            return head;

        Node prev = null;
        Node curr = head;
        Node next = curr.next;

        while (curr.next != null) {
            curr.next = prev;

            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        head = curr;
        return head;
    }

    public void reverseData() {
        if (this.root == null || this.root.next == null)
            return;

        Node prev = null;
        Node curr = this.root;
        Node next = curr.next;

        while (curr.next != null) {
            curr.next = prev;

            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;

        prev = this.root;
        this.root = this.tail;
        this.tail = prev;
    }

    public void display() {
        Node curr = this.root;
        System.out.println("*************************");
        while (curr != null) {
            System.out.print(curr.data + " => ");
            curr = curr.next;
        }
        System.out.println();
        System.out.println("*************************");
    }

    public void customDisplay(Node head) {
        Node curr = head;
        System.out.println("*************************");
        while (curr != null) {
            System.out.print(curr.data + " => ");
            curr = curr.next;
        }
        System.out.println();
        System.out.println("*************************");
    }

    public static void main(String[] args) {
        System.out.println("*************************");
    }

}
