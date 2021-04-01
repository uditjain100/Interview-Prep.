public class LPUT extends Dia {

    // *** longest-path-undirected-tree/

    public static void main(String[] args) {
        int[] preOrder = { 0, 1, 2, 9, -1, 4, 5, -1, -1, 3, -1, -1, 6, 7, -1, 8, -1, -1, -1, -1 };
        GTree tree = new GTree(preOrder);
        tree.display();
        System.out.println(dia(tree.root()).diameter);
    }

}
