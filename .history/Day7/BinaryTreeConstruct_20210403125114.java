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
        if (index == pre.length)
            return null;

        Node nn = new Node(pre[index]);

        if (preLN[index] == 'L')
            return nn;

        nn.left = constructor(pre, preLN);
        nn.right = constructor(pre, preLN);
        return nn;
    }

}
