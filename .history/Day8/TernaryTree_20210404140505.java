public class TernaryTree {

    public static class Node {
        int data;
        Node left;
        Node middle;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = this.middle = null;
        }
    }

    public static Node root;

    public TernaryTree(int[] pre, char[] preLN) {
        root = constructor(pre, preLN);
    }

    public static int idx = 0;

    public static Node constructor(int[] pre, char[] preLN) {
        if (idx == pre.length)
            return null;

        Node nn = new Node(pre[idx]);

        if (preLN[idx++] == 'N') {
            nn.left = constructor(pre, preLN);
            nn.middle = constructor(pre, preLN);
            nn.right = constructor(pre, preLN);
        }
        return nn;
    }

    public static void display() {
        display(root);
    }

    private static void display(Node node) {
        if (node == null)
            return;

        String str = node.data + " => ";

        if (node.left != null)
            str += "[" + node.left.data + "," + "L], ";
        if (node.middle != null)
            str += "[" + node.middle.data + "," + "M], ";
        if (node.right != null)
            str += "[" + node.right.data + "," + "R], ";

        System.out.println(str);

        display(node.left);
        display(node.middle);
        display(node.right);

    }

    public static Node DLLprev = null;
    public static Node DLLhead = null;

    public static void DLL(Node node) {
        if (node == null)
            return;

        System.out.println(node.data);

        DLL(node.left);

        if (DLLhead == null)
            DLLhead = node;
        else {
            DLLprev.middle = node;
            node.left = DLLprev;
        }

        DLLprev = node;

        DLL(node.middle);
        DLL(node.right);
    }

    public static void Dlldisplay() {
        DLL(root);
        Node curr = DLLhead;
        while (curr != null) {
            System.out.print(curr.data + ", ");
            curr = curr.middle;
        }
    }

    public static void main(String[] args) {

        int[] preOrder = { 1, 2, 5, 6, 7, 3, 8, 9, 10, 4, 11, 12, 13 };
        char[] preLN = { 'N', 'N', 'L', 'L', 'L', 'N', 'L', 'L', 'L', 'N', 'L', 'L', 'L' };
        TernaryTree tree = new TernaryTree(preOrder, preLN);
        tree.display();
        tree.Dlldisplay();

    }

}
