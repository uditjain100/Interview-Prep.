public class NodewithMaxSum extends GenericTree {
    public static void main(String[] args) {
        int[] preOrder = { 1, 2, 5, 6, 7, 3, 8, 9, 10, 4, 11, 13 };
        GenericTree tree = new GenericTree(preOrder, 3);
        tree.display();
    }

    public static void fun(Node node) {

        int res = 0;

        int sum = node.val;
        for (Node child : node.childs)
            if (child != null)
                sum += child.val;

    }

}
