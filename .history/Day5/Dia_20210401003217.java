import java.util.ArrayList;

public class Dia extends GTree {

    public static class Pair {
        int diameter, height;

        public Pair(int height, int diameter) {
            this.diameter = diameter;
            this.height = height;
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

    public static Pair dia(Node node) {
        if (node == null)
            return new Pair(0, 0);

        ArrayList<Pair> list = new ArrayList<>();
        for (Node child : node.childs)
            list.add(dia(child));

        Pair[] maxNodes = fun(list);

        Pair p = new Pair(0, 0);
        p.height = Math.max(maxNodes[0].height, maxNodes[1].height) + 1;
        p.diameter = Math.max(maxNodes[0].height + maxNodes[1].height + 2,
                Math.max(maxNodes[0].diameter, maxNodes[1].diameter));
        return p;
    }

    public static int f = 0;
    public static int s = 0;

    public static Pair[] fun(ArrayList<Pair> list) {

        Pair[] res = new Pair[2];
        Pair one = list.get(0);
        Pair two = list.get(0);

        for (Pair p : list) {
            if (p.height > f) {

            }
        }

    }

}
