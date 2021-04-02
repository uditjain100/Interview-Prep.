import java.util.ArrayList;
import java.util.Stack;

public class InOrderWithoutRecursion {

    public static class Pair {
        BinaryTree.Node node;
        boolean left;
        boolean self;
        boolean right;

        public Pair(BinaryTree.Node node, boolean left, boolean seld, boolean right) {
            this.node = node;
            this.left = false;
            this.self = false;
            this.right = false;
        }
    }

    public static ArrayList<Integer> inOrder(BinaryTree.Node node) {
        ArrayList<Integer> res = new ArrayList<>();

        Stack<Pair> stack = new Stack<>();
        BinaryTree.Node curr = node;
        stack.push(new Pair(curr));
        while (!stack.isEmpty()) {

        }

    }

}
