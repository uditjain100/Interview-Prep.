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

    public static Node construtor(int[] arr, int si, int ei) {

    }

}
