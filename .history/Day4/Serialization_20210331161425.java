public class Serialization extends ConstructingGenericTree {
    public static void main(String[] args) {
        String preOrder[] = { "A", "B", "E", "F", "G", "C", "H", "I", "J", "D" };
        ConstructingGenericTree tree = new ConstructingGenericTree(preOrder, 3);
        tree.display();
        fun(tree.root());
    }

    public static String fun(Node node) {

        return "";

    }

}
