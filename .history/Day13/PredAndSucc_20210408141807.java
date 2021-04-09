public class PredAndSucc {

    public static BinarySearchTree.Node rightmostOfLeft(BinarySearchTree.Node node, BinarySearchTree.Node curr) {
        BinarySearchTree.Node temp = node;
        while (temp.right != null && temp.right != curr)
            temp = temp.right;
        return temp;
    }

    public static BinarySearchTree.Node leftmostOfRight(BinarySearchTree.Node node, BinarySearchTree.Node curr) {
        BinarySearchTree.Node temp = node;
        while (temp.left != null && temp.left != curr)
            temp = temp.left;
        return temp;
    }

    // Inorder Pred And Succ
    public static void getPredAndSucc(BinarySearchTree.Node node, int data) {

        BinarySearchTree.Node curr = node;
        while (curr != null) {
            if (curr.left == null) {
                curr = curr.right;
            } else {
                BinarySearchTree.Node rightMost = rightmostOfLeft(curr.left, curr);
                if (rightMost.right == null) {
                    rightMost.right = curr;
                    curr = curr.left;
                } else {
                    rightMost.right = null;
                    curr = curr.right;
                }
            }
        }

    }

}
