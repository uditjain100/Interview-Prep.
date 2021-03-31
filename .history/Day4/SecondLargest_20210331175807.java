public class SecondLargest extends GenericTree {
    public static void main(String[] args) {
        int[] preOrder = { 1, 2, 5, 6, 7, 3, 8, 9, 10, 4, 11, 12, 13 };
        GenericTree tree = new GenericTree(preOrder, 3);
        // tree.display();
        s = tree.root().val;
        f = tree.root().val;
        System.out.println(fun(tree.root()));
    }

    public static int s = Integer.MIN_VALUE;
    public static int f = Integer.MIN_VALUE;

    public static int fun(Node node) {
        if (node == null)
            return Integer.MIN_VALUE;
        if (node.val > f) {
            s = f;
            f = node.val;
        }
        if (node.val > f && node.val < s)
            s = node.val;
        for (Node child : node.childs)
            s = Math.max(s, fun(child));
        return s;
    }

}
