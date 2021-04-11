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

}
