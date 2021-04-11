import java.util.ArrayList;

public class PersistentSegmentTree {

    public static class Node {
        ArrayList<Integer> data;
        int si;
        int ei;
        Node left;
        Node right;

        public Node(int si, int ei) {
            this.data = new ArrayList<>();
            this.si = si;
            this.ei = ei;
            this.left = this.right = null;
        }

        public Node(int data, int si, int ei) {
            this.data = new ArrayList<>();
            this.data.add(data);
            this.si = si;
            this.ei = ei;
            this.left = this.right = null;
        }

    }

    private static Node root;

    public PersistentSegmentTree(int[] arr) {
        root = constructor(arr, 0, arr.length - 1);
    }

    public static Node constructor(int[] arr, int si, int ei) {
        if (si == ei)
            return new Node(arr[si], si, ei);

        Node nn = new Node(si, ei);

        int mid = (si + ei) / 2;
        nn.left = constructor(arr, si, mid);
        nn.right = constructor(arr, mid + 1, ei);

        nn.data.add(nn.left.data.get(0) + nn.right.data.get(0));
        return nn;
    }

    public static int query(int si, int ei) {
        return query(root, si, ei);
    }

    public static int query(Node node, int si, int ei) {
        if (node == null || ei < node.si || si > node.ei)
            return 0;
        if (si <= node.si && ei >= node.ei)
            return node.data.get(node.data.size() - 1);
        return query(node.left, si, ei) + query(node.right, si, ei);
    }

    public static void update(int idx, int newValue) {
        update(root, idx, newValue);
    }

    public static int update(Node node, int idx, int newValue) {
        if (node == null)
            return 0;

        if (node.si == node.ei && node.si == idx)
            node.data.add(newValue);
        else if (node.si != node.ei)
            node.data.add(update(node.left, idx, newValue) + update(node.right, idx, newValue));

        return node.data.get(node.data.size() - 1);

    }

    public static void display() {
        display(root);
    }

    private static void display(Node node) {
        if (node == null)
            return;

        String str = "{ " + node.data + " ," + node.si + "," + node.ei + "}   :=> ";
        if (node.left != null)
            str += "{ " + node.left.data + " ," + node.left.si + "," + node.left.ei + ",L}, ";
        if (node.right != null)
            str += "{ " + node.right.data + " ," + node.right.si + "," + node.right.ei + ",R}";

        System.out.println(str);
        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
        PersistentSegmentTree tree = new PersistentSegmentTree(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 });
        tree.display();
        // System.out.println(query(0, 8));

    }

}
