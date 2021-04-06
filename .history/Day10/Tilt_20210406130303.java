public class Tilt {

    public static int sum = 0;

    public static int calculateTilt(BinaryTree.Node node) {
        if (node == null)
            return 0;

        int lr = calculateTilt(node.left);
        int rr = calculateTilt(node.right);

        sum += Math.abs(lr - rr);
        return lr + rr + node.data;

    }

    public static void main(String[] args) {
        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        calculateTilt(tree.root);
        System.out.println(sum);
    }

}
