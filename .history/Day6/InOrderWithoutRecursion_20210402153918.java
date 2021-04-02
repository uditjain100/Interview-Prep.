import java.util.ArrayList;
import java.util.Stack;

public class InOrderWithoutRecursion {

    public static class Pair {
        BinaryTree.Node node;
        boolean left;
        boolean self;
        boolean right;

        public Pair(BinaryTree.Node node, boolean left, boolean self, boolean right) {
            this.node = node;
            this.left = left;
            this.self = self;
            this.right = right;
        }
    }

    public static ArrayList<Integer> inOrder(BinaryTree.Node node) {
        ArrayList<Integer> res = new ArrayList<>();

        Stack<Pair> stack = new Stack<>();
        BinaryTree.Node curr = node;
        stack.push(new Pair(curr, false, false, false));
        while (!stack.isEmpty()) {
            Pair rp = stack.pop();
            if (!rp.left) {
                rp.left = true;
                if (curr.left != null)
                    stack.push(new Pair(curr.left, false, false, false));
            } else if (!rp.self) {

            } else if (!rp.right) {

            } else {

            }
        }

    }

}
