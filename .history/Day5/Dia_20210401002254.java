import java.util.ArrayList;

public class Dia extends GTree {

    public static class Pair {
        int d, h;

        public Pair(int height, int diameter) {
            this.d = diameter;
            this.h = height;
        }
    }

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

    public static int dia(Node node) {

        if (node == null)
            return new Pair(0, 0);

        ArrayList<Pair> list = new ArrayList<>();
        for (Node child : node.childs)
            list.add(dia(child));

        int[] maxNodes = fun(list);

        Pair p = new Pair(0, 0);
        p.height = Math.max(maxNodes[0], maxNodes[1]) + 1;

    }

}
