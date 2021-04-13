public class DeleteUnderCondition {

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
        System.out.println(list.getFirst().data);
        System.out.println(list.getLast().data);
        System.out.println(list.getAt(0).data);

        list.removeFirst();
        list.display();
        list.removeLast();
        list.display();
        list.removeAt(2);
        list.display();
    }

}
