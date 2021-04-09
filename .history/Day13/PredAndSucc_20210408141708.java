public class PredAndSucc {

    public static BinarySearchTree.Node rightmostOfLeft(BinarySearchTree.Node node, BinarySearchTree.Node curr) {
        BinarySearchTree.Node temp = node;
        while (temp.right != null && temp.right != curr)
            temp = temp.right;
        return temp;
    }

    public static BinarySearchTree.Node rightmostOfLeft(BinarySearchTree.Node node, BinarySearchTree.Node curr) {
        BinarySearchTree.Node temp = node;
        while (temp.right != null && temp.right != curr)
            temp = temp.right;
        return temp;
    }

    // Inorder Pred And Succ
    public static void getPredAndSucc(BinarySearchTree.Node node, int data) {

    }

}
