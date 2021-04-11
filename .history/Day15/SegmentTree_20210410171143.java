public class SegmentTree {

    public static class Node {
        int data;
        int si;
        int ei;
        Node left;
        Node right;

        public Node(int data, int si, int ei) {
            this.data = data;
            this.si = si;
            this.ei = ei;
            this.left = this.right = null;
        }
    }

    private static Node root;

    public SegmentTree(int[] arr) {
        root = constructor(arr, 0, arr.length - 1);
    }

    public static Node constructor(int[] arr, int si, int ei) {
        if (si == ei)
            return new Node(arr[si], si, ei);

        Node nn = new Node(0, si, ei);

        int mid = (si + ei) / 2;
        nn.left = constructor(arr, si, mid);
        nn.right = constructor(arr, mid + 1, ei);

        nn.data = nn.left.data + nn.right.data;
        return nn;
    }

    public static int query(int si, int ei) {
        return query(root, si, ei);
    }

    public static int query(Node node, int si, int ei) {
        if (node == null)
            return 0;

        if (si < node.si || ei > node.ei)
            return 0;
        else if (si >= node.si && ei <= node.ei)
            return node.data;
        else
            return query(node.left, si, ei) + query(node.right, si, ei);
    }

    public static void display() {
        display(root);
    }

    private static void display(Node node) {
        if (node == null)
            return;

        String str = "[" + node.data + "," + node.si + "," + node.ei + "]   :=> ";
        if (node.left != null)
            str += "[" + node.left.data + "," + node.left.si + "," + node.left.ei + ",L], ";
        if (node.right != null)
            str += "[" + node.right.data + "," + node.right.si + "," + node.right.ei + ",R]";

        System.out.println(str);
        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
        SegmentTree tree = new SegmentTree(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        tree.display();
        System.out.println(query(0, 5));
    }

}
