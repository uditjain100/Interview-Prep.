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

    public Node customMidPoint(Node head) {
        if (head == null || head.next == null)
            return head;

        Node slow = head;
        Node fast = head;

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

        Node midNode = midPoint();
        Node newHead = this.customReverse(midNode.next);
        midNode.next = null;

        Node curr = this.root;
        Node newCurr = newHead;

        while (curr != null && newCurr != null) {
            int temp = curr.data;
            curr.data = newCurr.data;
            newCurr.data = temp;

            curr = curr.next;
            newCurr = newCurr.next;
        }

        newHead = this.customReverse(newHead);
        midNode.next = newHead;
    }

    public Node mergeLists(Node head1, Node head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        Node resNode = new Node(-1);

        Node curr1 = head1;
        Node curr2 = head2;

        while (curr1 != null && curr2 != null) {
            if (curr1.data < curr2.data) {
                resNode.next = curr1;
                curr1 = curr1.next;
            } else {
                resNode.next = curr2;
                curr2 = curr2.next;
            }
            resNode = resNode.next;
        }
        return resNode.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;

        Node midNode = customMidPoint(head);
        Node newHead = midNode.next;
        midNode.next = null;

        return mergeLists(mergeSort(head), mergeSort(newHead));
    }

    public Node customMergeSort(Node head) {
        if (head == null || head.next == null)
            return head;

        Node midNode = customMidPoint(head);
        Node newHead = midNode.next;
        midNode.next = null;

        return mergeLists(customMergeSort(head), customMergeSort(newHead));
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

        LinkedList list = new LinkedList();
        list.addLast(50);
        list.addLast(23);
        list.addLast(1);
        list.addLast(12);
        list.addLast(-2);
        list.display();
        list.mergeSort(list.root);
    }

}
