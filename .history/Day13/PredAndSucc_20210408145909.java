public class PredAndSucc {

    public static BinarySearchTree.Node rightmostOfLeft(BinarySearchTree.Node node) {
        BinarySearchTree.Node temp = node;
        while (temp.right != null)
            temp = temp.right;
        return temp;
    }

    public static BinarySearchTree.Node leftmostOfRight(BinarySearchTree.Node node) {
        BinarySearchTree.Node temp = node;
        while (temp.left != null)
            temp = temp.left;
        return temp;
    }

    // Inorder Pred And Succ
    public static void getPredAndSucc(BinarySearchTree.Node node, int data) {
        int p = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;

        BinarySearchTree.Node curr = node;
        while (curr != null) {
            if (curr.data > data) {
                s = Math.min(s, curr.data);
                curr = curr.left;
            } else if (curr.data < data) {
                p = Math.max(p, curr.data);
                curr = curr.right;
            } else {

                if (curr.left != null) {

                }

                if (curr.right != null) {

                }
                break;
            }
        }

        System.out.println("Pred : " + p);
        System.out.println("Succ : " + s);

    }

}
