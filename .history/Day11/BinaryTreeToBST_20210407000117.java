import java.util.ArrayList;

public class BinaryTreeToBST {

    public static void convert(BinaryTree.Node node) {
        inOrder(node);

    }

    public static ArrayList<Integer> res = new ArrayList<>();

    public static void inOrder(BinaryTree.Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        res.add(node.data);
        inOrder(node.right);
    }

    public static int idx = 0;

    public static void setElements(BinaryTree.Node node) {
        if (node == null)
            return;
        setElements(node.left);
        node.data = res.get(idx++);
        setElements(node.right);
    }

}
