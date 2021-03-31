import java.util.ArrayList;

public class NodewithMoreChilds extends GenericTree {
    public static void main(String[] args) {
        String preOrder[] = { "A", "B", "E", "F", "G", "C", "H", "I", "J", "D" };
        ConstructingGenericTree tree = new ConstructingGenericTree(preOrder, 3);
        tree.display();
    }

    public static ArrayList<Integer> list = new ArrayList<>();

    public static void fun(Node node, int nocop) {
        if (node == null)
            return;
        if (node.childs.size() > nocop)
            list.add(node.val);
        for (Node child : node.childs)
            fun(child, node.childs.size());
    }

}
