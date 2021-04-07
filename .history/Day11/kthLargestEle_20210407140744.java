public class kthLargestEle {

    public static void count = 0;

    public static int getKthLargestElemwnt(BinarySearchTree.Node node, int k) {
        get(node, k);
        return ans.data;
    }

    public static BinarySearchTree.Node ans = null

    public static void get(BinarySearchTree.Node node, int k) {
        if (node == null)
            return;

        if (count == k) {
            ans = node;
            return;
        }

        get(node.right, k);
        count++;
        get(node.left, k);
    }

    public static void main(String[] args) {

    }

}
