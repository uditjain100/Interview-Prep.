public class Diameter extends GenericTree {
    public static void main(String[] args) {
        int[] preOrder = { 10, 20, 30, -1, 40, -1, 50, -1, -1, 60, 70, -1, 80, 90, -1, 100, -1, -1, 110, -1, -1, 120,
                130, -1, -1, -1 };
        GenericTree tree = new GenericTree(preOrder, 0);
        System.out.println("Tree Structure : ");
        tree.display();

    }
}
