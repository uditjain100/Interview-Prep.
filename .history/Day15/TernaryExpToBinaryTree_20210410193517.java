import javax.print.DocFlavor.STRING;

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
        stack.push(new Node('/'));

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == 0) {

            }
            if (i == str.length() - 1) {

            }

            char chm = str.charAt(i - 1);

        }

    }

    public static void main(String[] args) {
        convert("str");
    }

}
