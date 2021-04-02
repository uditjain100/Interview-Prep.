import java.util.Stack;

public class InOrderWithoutRecursion {

    public static class Pair {
        BinaryTree.Node node;
        boolean left;
        boolean self;
        boolean right;

        public Pair(BinaryTree.Node node) {
            this.node = node;
            this.left = false;
            this.self = false;
            this.right = false;
        }
    }

    public static int[] preOrder(BinaryTree.Node node) {

        Stack<Pair> stack = new Stack<>();

    }

}
