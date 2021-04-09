public class BSTtoMINheap {

    public static void convert(BinarySearchTree.Node node) {

        BinarySearchTree.Node head = BSTtoSortedDLL.DLLdisplay(node);

    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        convert(tree.root);
    }

}
