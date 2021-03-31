public class ImmediateSmallerNode extends ConstructingGenericTree {

    public static void main(String[] args) {

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
