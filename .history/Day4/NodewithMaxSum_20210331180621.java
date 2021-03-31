public class NodewithMaxSum extends GenericTree {
    public static void main(String[] args) {
        int[] preOrder = { 1, 2, 5, 6, 7, 3, 8, 9, 10, 4, 11, 13 };
        GenericTree tree = new GenericTree(preOrder, 3);
        tree.display();
        System.out.println(fun(tree.root()));
    }

    public static int fun(Node node) {
        if (node == null)
            return Integer.MIN_VALUE;
        int res = node.val;
        int sum = node.val;
        for (Node child : node.childs)
            if (child != null)
                sum += child.val;
        res = Math.max(sum, res);
        for (Node child : node.childs)
            res = Math.max(res, fun(child));
        return res;
    }

}
