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
                if (curr.left != null)
                    p = rightmostOfLeft(curr.left).data;
                if (curr.right != null)
                    s = leftmostOfRight(curr.right).data;
                break;
            }
        }

        System.out.println("Pred : " + p);
        System.out.println("Succ : " + s);

    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 30, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        getPredAndSucc(tree.root, 50);
    }

}
