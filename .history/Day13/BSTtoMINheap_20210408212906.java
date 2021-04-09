import java.util.LinkedList;

public class BSTtoMINheap {

    public static void convert(BinarySearchTree.Node node) {
        BinarySearchTree.Node head = BSTtoSortedDLL.DLLdisplay(node);

        BinarySearchTree.Node curr = head;
        LinkedList<BinarySearchTree.Node> queue = new LinkedList<>();
        queue.add(curr);
        curr = curr.right;
        while (!queue.isEmpty()) {
            int size = queue.isEmpty();
            while (size-- > 0) {
                BinarySearchTree.Node rn = queue.getFirst();
                if (curr == null)
                    break;
                rn.left = curr;
                queue.addLast(rn.left);
                curr = curr.next;
                if (curr == null)
                    break;
                rn.right = curr;
                queue.addLast(rn.right);
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        convert(tree.root);
    }

}
