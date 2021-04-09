import java.util.LinkedList;

public class BSTtoMINheap {

    public static void convert(BinarySearchTree.Node node) {
        BinarySearchTree.Node head = BSTtoSortedDLL.DLLdisplay(node);

        System.out.println(head);
        System.out.println(node);

        LinkedList<BinarySearchTree.Node> queue = new LinkedList<>();
        queue.add(head);
        head = head.right;

    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        convert(tree.root);
    }

}
