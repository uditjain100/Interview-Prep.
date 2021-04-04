public class BinaryTreeParent {

    public static int[] createParentArray(BinaryTree.Node node, int size) {
        int[] res = new int[size];
        createParentArray(node, res);
        return res;
    }

}
