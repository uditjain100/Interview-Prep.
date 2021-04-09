import BSTfromLevelOrder.Node;

public class AddGreaterValues {

    public static void addValues(BinarySearchTree.Node node) {
        add(node);
    }

    public static int sum(BinarySearchTree.Node node) {
        if (node == null)
            return 0;
        return sum(node.left) + sum(node.right) + node.data;
    }

    public static BinarySearchTree.Node rightmostOfLeft(BinarySearchTree.Node node, BinarySearchTree.Node curr) {
        BinaryTree.Node temp = node;
        while (temp.right != null && temp.right != curr)
            temp = temp.right;
        return temp;
    }

    public static void add(BinarySearchTree.Node node) {
        int sum = sum(node);

        BinarySearchTree.Node curr = node;
        while (curr != null) {
            if (curr.left == null) {
                sum -= curr.data;
                curr.data += sum;
                curr = curr.right;
            } else {
                BinarySearchTree.Node rightMost = rightmostOfLeft(curr.left, curr);
                if (rightMost.right == null) {
                    rightMost.right = curr;
                    curr = curr.left;
                } else {
                    rightMost.right = null;
                    sum -= curr.data;
                    curr.data += sum;
                    curr = curr.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        addValues(tree.root);
        tree.display();
    }

}
