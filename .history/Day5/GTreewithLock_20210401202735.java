import java.util.ArrayList;

public class GTreewithLock {

    public static class Node {
        int data;
        ArrayList<Node> childs;
        boolean isLocked;
        Node parent;
        int lockedChilds;

        public Node(int data) {
            this.data = data;
            this.childs = new ArrayList<>();
            this.isLocked = false;
            this.parent = null;
            this.lockedChilds = 0;
        }
    }

    private static Node root;

    public GTreewithLock(int[] preOrder) {
        root = construct(preOrder);
    }

    public static Node constructor(int[] preOrder) {
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < preOrder.length - 1; i++) {
            if (preOrder[i] != -1) {
                Node node = new Node(preOrder[i]);
                stack.add(node);
            } else {
                Node rn = stack.pop();
                rn.parent = stack.peek();
                stack.peek().childs.add(rn);
            }
        }
        return stack.peek();
    }

}
