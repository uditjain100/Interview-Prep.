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
                rp.self = true;
                res.add(rp.node.data);
            } else if (!rp.right) {
                rp.right = true;
                if (curr.right != null)
                    stack.push(new Pair(curr.right, false, false, false));
            } else {
                stack.pop();
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] preOrder = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, 60, 100, -1, -1, -1, 70, 110, -1, -1,
                120, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        tree.display();
        System.out.println(inOrder(tree.root));
    }

}
