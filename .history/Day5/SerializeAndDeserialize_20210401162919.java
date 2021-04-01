public class SerializeAndDeserialize {

    public static void main(String[] args) {
        int[] preOrder = { 10, 20, 30, -1, 40, -1, 50, -1, -1, 60, 70, -1, 80, 90, -1, 100, -1, -1, 110, -1, -1, 120,
                130, -1, -1, -1 };
        GTree tree = new GTree(preOrder);
        tree.display();
        System.out.println(serialize(tree.root()));
    }

    public static String serialize(GTree.Node node) {
        if (node.childs.size() == 0)
            return node.data + "/";

        String res = node.data + ",";
        for (GTree.Node child : node.childs)
            res += serialize(child);

        return res;
    }

}
