public class BinaryTreeParent {

    public static int[] createParentArray(BinaryTree.Node node, int size) {
        int[] res = new int[size + 1];
        createParentArray(node, res);
        return res;
    }

    public static void createParentArray(BinaryTree.Node node, int[] arr) {

        arr[node.data] = 

    }

}
