public class kthLargestEle {

    public static int count = 0;

    public static int getKthLargestElemwnt(BinarySearchTree.Node node, int k) {
        get(node, k);
        return ans.data;
    }

    public static BinarySearchTree.Node ans = null;

    public static void get(BinarySearchTree.Node node, int k) {
        if (node == null)
            return;

        get(node.right, k);
        if (count == k) {
            ans = node;
            return;
        }
        get(node.left, k);
        count++;

        if (count == k) {
            ans = node;
            return;
        }
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        System.out.println(getKthLargestElemwnt(tree.root, 3));
    }

}
