public class SubtreeWithGivenSum {

    public static class Pair {
        int count;
        int sum;

        public Pair() {
            this.sum = 0;
            this.count = 0;
        }

        public Pair(int data) {
            this.sum = data;
            this.count = 0;
        }
    }

    public static Pair countSubtrees(BinaryTree.Node node, int target) {
        if (node == null)
            return new Pair();

        Pair p = new Pair(node.data);

        Pair lp = countSubtrees(node.left, target);
        Pair rp = countSubtrees(node.right, target);

        p.sum += lp.sum + rp.sum;

        if (sum == target)
            count++;
        return sum;
    }

}
