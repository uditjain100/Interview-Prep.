import GTree.Node;

public class Diameter {
    public static void main(String[] args) {
        int[] preOrder = { 10, 20, 30, -1, 40, -1, 50, -1, -1, 60, 70, -1, 80, 90, -1, 100, -1, -1, 110, -1, -1, 120,
                130, -1, -1, -1 };
        GTree tree = new GTree(preOrder);
        System.out.println("Tree Structure : ");
        tree.display();
        System.out.println(height(tree.root()));
    }

    public static int height(Node node) {
        if (node == null)
            return 0;
        int ch = 0;
        for (Node child : node.childs)
            ch = Math.max(ch, height(child));
        return ch + 1;
    }

}
