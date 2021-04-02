import java.util.ArrayList;

public class morrisinOrder {

    public static BinaryTree.Node rightmostOfLeft(BinaryTree.Node node, BinaryTree.Node curr) {
        BinaryTree.Node temp = node;
        while (temp.right != null && temp.right != curr)
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

    public static ArrayList<Integer> morrisPre(BinaryTree.Node node) {
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
                    res.add(curr.data);
                    curr = curr.left;
                } else {
                    rightMost.right = null;
                    curr = curr.right;
                }
            }
        }
        return res;

    }

    public static ArrayList<Integer> morrisPost(BinaryTree.Node node) {
        ArrayList<Integer> res = new ArrayList<>();

        BinaryTree.Node curr = node;
        BinaryTree.Node first = node;
        BinaryTree.Node middle = node;
        BinaryTree.Node last = node;
        while (curr != null) {
            if (curr.left == null) {
                curr = curr.right;
            } else {
                BinaryTree.Node rightMost = rightmostOfLeft(curr.left, curr);
                if (rightMost.right == null) {
                    rightMost.right = curr;
                    curr = curr.left;
                } else {

                    first = curr;
                    middle = curr.left;
                    while (middle != curr) {
                        last = middle.right;
                        middle.right = first;
                        first = middle;
                        middle = last;
                    }

                    first = curr;
                    middle = pred;
                    while (middle != curr) {
                        res.add(middle.data);
                        last = middle.right;
                        middle.right = first;
                        first = middle;
                        middle = last;
                    }

                    rightMost.right = null;
                    curr = curr.right;
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {

        int[] preOrder = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, 60, 100, -1, -1, -1, 70, 110, -1, -1,
                120, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        tree.display();
        System.out.println(morrisIn(tree.root));
        System.out.println(morrisPre(tree.root));
    }
}
