public class ExpressionTree {

    public static class ExpNode {
        char ch;
        ExpNode left;
        ExpNode right;

        public ExpNode(char ch) {
            this.ch = ch;
            this.left = this.right = null;
        }
    }

    public ExpressionTree(String postFix) {

    }

}
