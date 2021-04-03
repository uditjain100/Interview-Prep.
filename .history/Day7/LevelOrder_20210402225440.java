import java.util.ArrayList;
import java.util.LinkedList;

public class LevelOrder {

    public static ArrayList<ArrayList<Integer>> levelOrder(BinaryTree.Node node) {

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
            ArrayList<Integer> temp = res.get(level).clone();
            level++;
        }
        return res;
    }

    public static void main(String[] args) {

        int[] preOrder = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, 60, 100, -1, -1, -1, 70, 110, -1, -1,
                120, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        tree.display();
        System.out.println(levelOrder(tree.root));
    }

}
