public class BinaryTreeParent {

    public static int[] createParentArray(BinaryTree.Node node, int size) {
        int[] res = new int[size + 1];
        createParentArray(node, res);
        return res;
    }

    public static void createParentArray(BinaryTree.Node node, int[] arr) {
        if (node == null)
            return;

        if (node.left != null)
            arr[node.left.data] = node.data;
        if (node.right != null)
            arr[node.right.data] = node.data;
        createParentArray(node.left, arr);
        createParentArray(node.right, arr);
    }

}
