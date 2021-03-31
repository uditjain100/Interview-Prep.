public class SecondLargest extends GenericTree {
    public static void main(String[] args) {

    }

    public static void fun(Node node, int f, int s) {

        if (node.val > f) {
            s = f;
            f = node.val;
        }
        if (node.val > f && node.val < s) {
            s = node.val;
        }
        for (Node child : node.childs) {

        }

    }

}
