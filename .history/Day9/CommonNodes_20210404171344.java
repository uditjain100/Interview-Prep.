import java.util.ArrayList;

public class CommonNodes {

    ArrayList<Integer> res = new ArrayList<>();

    public static boolean printCommonNodes(BinaryTree.Node node, int p, int q) {
        if (node == null)
            return false;

        boolean selfDone = false;
        if (node.data == p || node.data == q)
            selfDone = true;

        boolean leftDone = printCommonNodes(node.left, p, q);
        if (LCA != null) {
            System.out.print(node.data + ", ");
            return true;
        }
        boolean rightDone = printCommonNodes(node.right, p, q);
        if (LCA != null) {
            System.out.print(node.data + ", ");
            return true;
        }

        if ((leftDone && rightDone) || (leftDone && selfDone) || (selfDone && rightDone)) {
            System.out.print(node.data + ", ");
            LCA = node;
        }
        return selfDone || leftDone || rightDone;
    }

    public static void main(String[] args) {

    }

}
