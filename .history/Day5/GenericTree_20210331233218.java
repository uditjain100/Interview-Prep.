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
