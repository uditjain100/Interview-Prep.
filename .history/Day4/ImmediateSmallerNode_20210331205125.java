public class ImmediateSmallerNode extends GenericTree {

    public static void main(String[] args) {
        int[] preOrder = { 1, 2, 5, 6, 7, 3, 8, 9, 10, 4, 11, 12, 13 };
        GenericTree tree = new GenericTree(preOrder, 3);
        tree.display();
        System.out.println(fun(tree.root(), 0));
    }

    public static int fun(Node node, int ele) {
        if (node == null)
            return Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;
        if (node.val < ele)
            res = Math.max(res, node.val);
        for (Node child : node.childs)
            res = Math.max(res, fun(child, ele));
        return res;
    }

}
