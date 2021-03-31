import java.util.ArrayList;

public class NodewithMoreChilds extends GenericTree {
    public static void main(String[] args) {

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
