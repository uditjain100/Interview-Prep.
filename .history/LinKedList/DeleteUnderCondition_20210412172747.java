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
        DoublyLL list = new DoublyLL();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        System.out.println(list.size);
        list.display();
        System.out.println(list.getFirst().data);
        System.out.println(list.getLast().data);
        System.out.println(list.getAt(0).data);
        list.removeFirst();
        list.display();
        list.removeLast();
        list.display();
        list.removeAt(2);
        list.display();
        System.out.println(list.size);
    }

}
