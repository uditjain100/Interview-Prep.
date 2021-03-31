public class SecondLargest extends GenericTree {
    public static void main(String[] args) {

    }

    public static int fun(Node node, int f) {
        if (node == null)
            return;
        int s = node.val;
        if (node.val > f) {
            s = f;
            f = node.val;
        }
        if (node.val > f && node.val < s)
            s = node.val;
        for (Node child : node.childs)
            s = Math.max(s, fun(child, f));
        return s;
    }

}
