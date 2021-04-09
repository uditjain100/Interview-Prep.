public class MaxBtwTwoNodes {

    public static BinarySearchTree.Node LCA(BinarySearchTree.Node node, int a, int b) {

        if (node.data > a && node.data > b)
            return LCA(node.left, a, b);
        else if (node.data < a && node.data < b)
            return LCA(node.right, a, b);
        else {
            return node;
        }

    }

}
