public class BinaryTreeConstruct {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node root;

    public BinaryTreeConstruct(int[] pre, char[] preLN) {
        root = constructor(pre, preLN);
    }

    public static int index = 0;

    public static Node constructor(int[] pre, char[] preLN) {

        Node nn = new Node(pre[index]);

        if (preLN[index++] == 'L')
            return nn;

        if (index < pre.length)
            nn.left = constructor(pre, preLN);
        if (index < pre.length)
            nn.right = constructor(pre, preLN);
        return nn;
    }

    public static void display() {
        display(root);
    }

    private static void display(Node node) {
        if (node == null)
            return;

        String str = node.data + " => ";

        if (node.left != null)
            str += node.left.data + ", ";
        if (node.right != null)
            str += node.right.data + ", ";

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {

        int pre[] = new int[] { 10, 30, 20, 5, 15 };
        char preLN[] = new char[] { 'N', 'N', 'L', 'L', 'L' };
        BinaryTreeConstruct btree = new BinaryTreeConstruct(pre, preLN);
        btree.display();
    }

}
