import java.util.ArrayList;

public class LeastGreaterOnRight {

    public static ArrayList<Integer> filter(int[] arr) {
        BinarySearchTree tree = new BinarySearchTree(arr);
        inOrder(tree.root);

    }

    public static ArrayList<Integer> res = new ArrayList<>();

    public static void preOrder(BinarySearchTree.Node node) {
        if (node == null)
            return;
        res.add(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static int prev = -1;

    public static void inOrder(BinarySearchTree.Node node) {
        if (node == null)
            return;

        inOrder(node.right);

        int temp = node.data;
        node.data = -1;
        prev = temp;

        inOrder(node.left);
    }

}
