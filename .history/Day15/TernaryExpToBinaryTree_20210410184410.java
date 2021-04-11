import java.util.Stack;

public class TernaryExpToBinaryTree {

    public static class Node {
        char ch;
        Node left;
        Node right;

        public Node(char ch) {
            this.ch = ch;
            this.left = this.right = null;
        }
    }

    public static void convert(String str) {

        Stack<Node> stack = new Stack<>();
        stack.push(new Node('a'));

    }

}
