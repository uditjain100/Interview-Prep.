public class SameBSTrees {

    public static boolean checkIfSame(BinarySearchTree.Node node1, BinarySearchTree.Node node2) {

        return true;
    }

    public static void main(String[] args) {

        int[] a = { 8, 3, 6, 1, 4, 7, 10, 14, 13 };
        BinarySearchTree tree1 = new BinarySearchTree(a);
        tree1.display();
        int[] b = { 8, 10, 14, 3, 6, 4, 1, 7, 13 };
        BinarySearchTree tree2 = new BinarySearchTree(b);
        tree2.display();

    }

}
