public class morrisinOrder {

    public static BinaryTree.Node rightmostOfLeft(BinaryTree Node, BinaryTree curr) {
        BinaryTree.Node temp = node;
        while (temp != null || temp.right == curr)
            temp = temp.right;
        return temp;
    }

    public static ArrayList<Integer> morrisIn(BinaryTree.Node node) {

        BinaryTree.Node curr = node;
        while (curr != null) {
            if (curr.left == null) {

            } else {
                BinaryTree.Node rightMost = rightmostOfLeft(curr.left, curr);
                if (rightMost.right == null) {

                } else {

                }
            }
        }

    }

}
