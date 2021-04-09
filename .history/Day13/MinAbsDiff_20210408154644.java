public class MinAbsDiff {

    public static void getPredAndSucc(BinarySearchTree.Node node, int data) {
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

        System.out.println("Pred : " + p);
        System.out.println("Succ : " + s);

    }

}
