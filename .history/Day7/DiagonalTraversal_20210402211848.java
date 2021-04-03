import java.util.ArrayList;
import java.util.LinkedList;

public class DiagonalTraversal {

    public static ArrayList<Integer> leftView(BinaryTree.Node node) {

        ArrayList<Integer> res = new ArrayList<>();
        LinkedList<BinaryTree.Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int size = queue.size();
            res.add(queue.getFirst().data);
            while (size-- > 0) {
                BinaryTree.Node rn = queue.removeFirst();
                if (rn.left != null)
                    queue.addLast(rn.left);
                if (rn.right != null)
                    queue.addLast(rn.right);
            }
        }
        return res;
    }

    public static ArrayList<Integer> rightView(BinaryTree.Node node) {

        ArrayList<Integer> res = new ArrayList<>();
        LinkedList<BinaryTree.Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int size = queue.size();
            BinaryTree.Node prev = queue.getLast();
            while (size-- > 0) {
                BinaryTree.Node rn = queue.removeFirst();
                prev = rn;

                if (rn.left != null)
                    queue.addLast(rn.left);
                if (rn.right != null)
                    queue.addLast(rn.right);
            }
            res.add(queue.getFirst().data);
        }
        return res;
    }

}
