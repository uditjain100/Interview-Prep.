import java.util.ArrayList;
import java.util.Collections;

public class BinaryTreeToBST {

    public static void convert(BinaryTree.Node node) {
        inOrder(node);
        Collections.sort(res);
        setElements(node);
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

    public static void main(String[] args) {
        int[] preOrder = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, 60, 100, -1, -1, -1, 70, 110, -1, -1,
                120, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        tree.display();
        convert(tree.root);
        tree.display();
    }

}
