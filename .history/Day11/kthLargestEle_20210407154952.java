public class kthLargestEle {

    public static int count = 0;

    public static int getKthLargestElemwnt(BinarySearchTree.Node node, int k) {
        count = 0;
        getLargest(node, k);
        return kthLargest.data;
    }

    public static BinarySearchTree.Node kthLargest = null;

    public static void getLargest(BinarySearchTree.Node node, int k) {
        if (node == null || count == k)
            return;

        getLargest(node.right, k);
        count++;
        if (count == k)
            kthLargest = node;
        getLargest(node.left, k);
    }

    public static BinarySearchTree.Node kthSmallest = null;

    public static int getKthSmallestElemwnt(BinarySearchTree.Node node, int k) {
        count = 0;
        getSmallest(node, k);
        return kthSmallest.data;
    }

    public static void getSmallest(BinarySearchTree.Node node, int k) {
        if (node == null || count == k)
            return;

        getSmallest(node.left, k);
        count++;
        if (count == k)
            kthSmallest = node;
        getSmallest(node.right, k);
    }

    public static BinarySearchTree.Node rightMostOfLeft(BinarySearchTree.Node node, BinarySearchTree.Node curr) {
        while (node.right != null || node.right != curr)
            node = node.right;
        return node;
    }

    public static void morris(BinarySearchTree.Node curr) {

        BinarySearchTree.Node node = curr;
        if (node.left == null) {
            node = node.right;
        } else {
            BinarySearchTree.Node rightMost = rightMostOfLeft(node.left, node);
            if (rightMost.right == null) {
                rightMost.right = node;
                node = rightMost.right;
            } else {

            }
        }

    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        System.out.println(getKthLargestElemwnt(tree.root, 4));
        System.out.println(getKthSmallestElemwnt(tree.root, 4));
    }

}
