import java.util.Stack;

public class ExpressionTree {

    public static class ExpNode {
        char data;
        ExpNode left;
        ExpNode right;

        public ExpNode(char ch) {
            this.data = ch;
            this.left = this.right = null;
        }
    }

    public static ExpNode root;

    public ExpressionTree(String postFix) {
        char[] arr = postFix.toCharArray();
        root = constructor(arr);
    }

    public static ExpNode constructor(char[] arr) {
        Stack<ExpNode> stack = new Stack<>();

        for (char ch : arr) {
            ExpNode nn = new ExpNode(ch);
            if (ch > 'z' || ch < 'a') {
                nn.right = stack.pop();
                nn.left = stack.pop();
            }
            stack.push(nn);
        }
        return stack.peek();
    }

    public static void display() {
        display(root);
    }

    private static void display(ExpNode node) {
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

        String postfix = "ab+ef*g*-";
        ExpressionTree tree = new ExpressionTree(postFix);
        tree.display();

    }

}
