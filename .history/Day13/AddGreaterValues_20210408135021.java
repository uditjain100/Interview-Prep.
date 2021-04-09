public class AddGreaterValues {

    public static void addValues(BinarySearchTree.Node node) {
        add(node);
    }

    public static int sum(BinarySearchTree.Node node) {
        if (node == null)
            return 0;
        return sum(node.left) + sum(node.right) + node.data;
    }

    public static int add(BinarySearchTree.Node node) {

    }

}
