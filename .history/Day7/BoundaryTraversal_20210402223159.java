import java.util.ArrayList;

public class BoundaryTraversal {

    public static void main(String[] args) {

        int[] preOrder = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, 60, 100, -1, -1, -1, 70, 110, -1, -1,
                120, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        tree.display();

    }

    public static void boundaryTraversal(BinaryTree.Node node) {
        DiagonalTraversal traversals = new DiagonalTraversal();

        ArrayList<Integer> res = new ArrayList<>();

        ArrayList<Integer> tv = traversals.topView(node);
        ArrayList<Integer> bv = traversals.bottomView(node);
        int le = -traversals.leftEnd;

        while (le > 0)
            res.add(tv.get(le--));
        while (le >= 0)
            res.add(tv.get(le--));

    }

}
