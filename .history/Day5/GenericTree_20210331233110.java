public class GenericTree {

    public static class Node {
        int data;
        ArrayList<Node> childs;

        public Node(int data) {
            this.data = data;
            this.childs = new ArrayList<Lecture_09_Generic_Tree.Node>();
        }
    }

    private static Node root = null;

    public static void constructor() {

        int[] preOrder = { 10, 20, 30, -1, 40, -1, 50, -1, -1, 60, 70, -1, 80, 90, -1, 100, -1, -1, 110, -1, -1, 120,
                130, -1, -1, -1 };
        root = constuctTree(preOrder, 0);
        System.out.println("Tree Structure : ");
        display(root);
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
