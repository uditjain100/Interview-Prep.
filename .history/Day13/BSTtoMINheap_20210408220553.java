import java.util.LinkedList;

public class BSTtoMINheap {

    public static BinarySearchTree.Node convert(BinarySearchTree.Node node) {
        BinarySearchTree.Node head = BSTtoSortedDLL.DLLdisplay(node);

        BinarySearchTree.Node curr = head;
        LinkedList<BinarySearchTree.Node> queue = new LinkedList<>();
        queue.add(curr);
        curr = curr.right;
        while (!queue.isEmpty() && curr != null) {
            int size = queue.size();
            while (size-- > 0) {
                BinarySearchTree.Node rn = queue.removeFirst();
                if (curr == null)
                    break;
                temp = curr.right;
                curr.left = null;
                curr.right = null;
                rn.left = curr;
                queue.add(rn.left);
                curr = temp;

                if (curr == null)
                    break;
                temp = curr.right;
                curr.left = null;
                curr.right = null;
                rn.right = curr;
                queue.add(rn.right);
                curr = temp;
            }
            if (curr != null) {
                while (!queue.isEmpty()) {
                    BinarySearchTree.Node rn = queue.removeFirst();
                    rn.left = null;
                    rn.right = null;
                }
            }
        }
        return head;
    }

    public static void display(BinarySearchTree.Node node) {
        if (node == null)
            return;

        String str = node.data + " => ";

        if (node.left != null)
            str += "[" + node.left.data + ",L], ";
        if (node.right != null)
            str += "[" + node.right.data + ",R]";

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        display(convert(tree.root));
    }

}
