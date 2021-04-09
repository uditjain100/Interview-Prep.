import java.util.ArrayList;

public class LeastGreaterOnRight {

    public static ArrayList<Integer> filter(int[] arr) {
        BinarySearchTree tree = new BinarySearchTree(arr);

    }

    public static int prev = -1;

    public static void inOrder(BinarySearchTree.Node node) {

        inOrder(node.right);

        int temp = node.data;
        node.data = -1;
        prev = temp;

        inOrder(node.left);

    }

}
