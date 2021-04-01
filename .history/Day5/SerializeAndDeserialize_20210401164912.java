import java.util.ArrayList;
import java.util.Stack;

import GTree.Node;

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
        res += "/";
        return res;
    }

    public static ArrayList<String> decode(String str) {
        ArrayList<String> preOrder = new ArrayList<>();

        String res = "";
        for (char ch : str.toCharArray()) {
            if (ch == ',') {
                preOrder.add(res);
                res = "";
            } else if ('/') {
                preOrder.add(res);
                preOrder.add("/");
                res = "";
            } else {
                res += ch;
            }
        }
        return preOrder;
    }

    public static GTree.Node deserialize(ArrayList<String> preOrder) {
        Stack<GTree.Node> stack = new Stack<>();
        for (String s : preOrder) {
            if (s.equals("/")) {
                GTree.Node rn = stack.pop();
                stack.peek().childs.add(rn);
            } else {
                GTree.Node nn = new GTree.Node(Integer.parseInt(s));
                stack.push(nn);
            }
        }
        return stack.peek();
    }

}
