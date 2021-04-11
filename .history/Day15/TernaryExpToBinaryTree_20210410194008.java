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
            if (ch == '?' || ch == ':')
                continue;

            if (i == 0) {
                stack.push(new Node(ch));
                continue;
            }

            if (i == str.length() - 1) {
                stack.peek().right = new Node(ch);
                continue;
            }

            char chp = str.charAt(i - 1);
            char cha = str.charAt(i + 1);

            if (chp == '?' && cha == '?') {
                stack.push(new Node(ch));
            } else if (chp == ':' && cha == '?') {
                stack.peek().left = new Node(ch);
            } else if (chp == '?' && cha == ':') {

            } else {

            }

        }

    }

    public static void main(String[] args) {
        convert("str");
    }

}
