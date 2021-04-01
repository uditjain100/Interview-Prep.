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

    public static Node root() {
        return root;
    }

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

    public static void display() {
        display(root);
    }

    private static void display(Node node) {
        if (node == null)
            return;
        String str = node.data + " => ";
        for (Node child : node.childs)
            if (child != null)
                str += child.data + ", ";

        System.out.println(str);
        for (Node child : node.childs)
            display(child);
    }

    public static isLock(Node node){
        return node.isLocked;
    }

    public static boolean lock(Node node) {

        if (node.lockedChilds > 0)
            return false;

        Node temp = node.parent;
        while (temp != null) {
            if (temp.isLocked)
                return false;
            temp = temp.parent;
        }

    }

}
