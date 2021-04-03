import java.util.ArrayList;
import java.util.LinkedList;

public class LevelOrder {

    public static ArrayList<ArrayList<Integer>> verticalOrder(BinaryTree.Node node) {

        int width = getWidth(node);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= rightEnd; i++)
            res.add(new ArrayList<>());
        LinkedList<BinaryTree.Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                BinaryTree.Node rn = queue.removeFirst();
                res.get(rn.level).add(rn.node.data);
                if (rn.node.left != null)
                    queue.addLast(node.left);
                if (rn.node.right != null)
                    queue.addLast(node.right);
            }
        }
        return res;
    }

}
