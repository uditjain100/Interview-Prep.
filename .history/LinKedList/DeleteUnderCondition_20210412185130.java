public class DeleteUnderCondition {

    public static void deleteNode(LinkedList.Node node) {
        if (node == null || node.next == null)
            return;
        while (node.next != null) {
            node.data = node.next.data;
            if (node.next.next == null)
                break;
            node = node.next;
        }
        node.next = null;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        System.out.println(list.size);
        list.display();
        list.customReverse(list.getFirst());

    }

}
