public class GenericTree {

    public static class Node {
        int data;
        ArrayList<Node> childs;

        public Node(int data) {
            this.data = data;
            this.childs = new ArrayList<Lecture_09_Generic_Tree.Node>();
        }
    }

    private static Node root;

    public GenericTree() {
        root = constuctTree(preOrder);
    }

    public static void constructor(int[] preOrder) {
        Stack<Node> stack = new Stack<Lecture_09_Generic_Tree.Node>();
        for (int i = 0; i < preOrder.length - 1; i++) {
            if (preOrder[i] != -1) {
                Node node = new Node(preOrder[i]);
                stack.add(node);
            } else {
                Node rn = stack.pop();
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
        String str = node.val + " => ";
        for (Node child : node.childs)
            if (child != null)
                str += child.val + ", ";

        System.out.println(str);
        for (Node child : node.childs)
            display(child);
    }

}
