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

}
