public class MinAbsDiff {

    public static int getPredAndSucc(BinarySearchTree.Node node, int data) {
        int p = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;

        BinarySearchTree.Node curr = node;
        while (curr != null) {
            if (curr.data > data) {
                s = Math.min(s, curr.data);
                curr = curr.left;
            } else if (curr.data < data) {
                p = Math.max(p, curr.data);
                curr = curr.right;
            } else
                return curr.data;
        }

        if (Math.abs(p - data) < Math.abs(data - s))
            return p;
        return s;
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 30, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        System.out.println();
    }

}
