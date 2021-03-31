public class Serialization extends ConstructingGenericTree {
    public static void main(String[] args) {
        String preOrder[] = { "A", "B", "E", "F", "G", "C", "H", "I", "J", "D" };
        ConstructingGenericTree tree = new ConstructingGenericTree(preOrder, 3);
        tree.display();
        System.out.println(serialize(tree.root()));

    }

    // public static Node deserialize(String str) {

    // }

    public static String serialize(Node node) {
        String str = node.val;
        for (Node child : node.childs)
            str += serialize(child);
        return str;
    }

}
