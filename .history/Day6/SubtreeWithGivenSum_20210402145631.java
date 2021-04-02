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

        Pair p = new Pair();

        int sum = node.val;
        sum += countSubtrees(node.left, target);
        sum += countSubtrees(node.right, target);

        if (sum == target)
            count++;
        return sum;
    }

}
