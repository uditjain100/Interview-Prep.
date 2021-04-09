public class LeastGreaterInRight {

    public static int succ = -1;

    public static int[] filter(int[] arr) {
        BinarySearchTree tree = new BinarySearchTree();
        for (int ele : arr) {
            succ = -1;
            tree.add(ele);
        }
        tree.display();
        return new int[0];
    }

    public static BinarySearchTree.Node rightmostOfLeft(BinarySearchTree.Node node) {
        BinarySearchTree.Node temp = node;
        while (temp.right != null)
            temp = temp.right;
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

    public static void replaceSucc(BinarySearchTree.Node node, int data) {

    }

    public static void main(String[] args) {
        filter(new int[] { 8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28 });
    }

}
