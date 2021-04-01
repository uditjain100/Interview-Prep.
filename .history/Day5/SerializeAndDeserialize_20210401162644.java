public class SerializeAndDeserialize {

    public static String serialize(GTree.Node node) {
        if (node.childs.size() == 0)
            return "/";

        String res = node.data + ",";
        for (GTree.Node child : node.childs)
            res += serialize(child);

        return res;
    }

}
