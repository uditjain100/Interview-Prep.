import java.util.ArrayList;

public class morrisinOrder {

    public static BinaryTree.Node rightmostOfLeft(BinaryTree.Node node, BinaryTree.Node curr) {
        BinaryTree.Node temp = node;
        while (temp != null || temp.right == curr)
            temp = temp.right;
        return temp;
    }

    public static ArrayList<Integer> morrisIn(BinaryTree.Node node) {
        ArrayList<Integer> res = new ArrayList<>();

        BinaryTree.Node curr = node;
        while (curr != null) {
            if (curr.left == null) {
                res.add(curr.data);
                curr = curr.right;
            } else {
                BinaryTree.Node rightMost = rightmostOfLeft(curr.left, curr);
                if (rightMost.right == null) {
                    rightMost.right = curr;
                    curr = curr.left;
                } else {
                    rightMost.right = null;
                    res.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        return res;

    }

}
