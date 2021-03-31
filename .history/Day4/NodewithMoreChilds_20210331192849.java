import java.util.ArrayList;

public class NodewithMoreChilds extends GenericTree {
    public static void main(String[] args) {
        int[] preOrder = { 1, 2, 5, 6, 7, 3, 8, 9, 10, 4, 11, 13 };
        GenericTree tree = new GenericTree(preOrder, 3);
        tree.display();
        fun(tree.root());
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
