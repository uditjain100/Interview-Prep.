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

    }

    public static int idx = 0;

    public static Node construct(char[] arr) {
        if(arr.length == idx) return null;
        Node nn = new Node(arr[idx++])

    }

    public static void main(String[] args) {
        convert("str");
    }

}
