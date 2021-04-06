public class Tilt {

    public static int sum = 0;

    public static int calculateTilt(BinaryTree.Node node) {
        if (node == null)
            return 0;

        int lr = calculateTilt(node.left);
        int rr = calculateTilt(node.right);

        sum += Math.abs(lr - rr);
        return lr + rr;
    }

}
