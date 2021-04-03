import java.util.ArrayList;
import java.util.LinkedList;

public class LevelOrder {

    public static ArrayList<ArrayList<Integer>> verticalOrder(BinaryTree.Node node) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        LinkedList<BinaryTree.Node> queue = new LinkedList<>();
        queue.add(node);

        int level = 0;
        while (!queue.isEmpty()) {
            res.add(new ArrayList<>());
            int size = queue.size();
            while (size-- > 0) {
                BinaryTree.Node rn = queue.removeFirst();
                res.get(level).add(rn.data);
                if (rn.left != null)
                    queue.addLast(rn.left);
                if (rn.right != null)
                    queue.addLast(rn.right);
            }
            level++;
        }
        return res;
    }

}
