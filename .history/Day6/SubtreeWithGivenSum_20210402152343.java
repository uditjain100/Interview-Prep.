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
        p.count += lp.count + rp.count;

        if (p.sum == target)
            p.count++;

        return p;
    }

    public static void main(String[] args) {

        int[] preOrder = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, 60, 100, -1, -1, -1, 70, 110, -1, -1,
                120, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        tree.display();
        System.out.println(countSubtrees(tree.root, 190).count);
    }

}
