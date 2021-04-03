import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class VerticalOrder {

    public static int leftEnd = Integer.MAX_VALUE;
    public static int rightEnd = Integer.MIN_VALUE;

    public static int getWidth(BinaryTree.Node node) {
        width(node, 0);
        return rightEnd - leftEnd + 1;
    }

    private static void width(BinaryTree.Node node, int level) {
        if (node == null)
            return;

        leftEnd = Math.min(leftEnd, level);
        rightEnd = Math.max(rightEnd, level);

        width(node.left, level - 1);
        width(node.right, level + 1);
    }

    public static class Pair {
        BinaryTree.Node node;
        int level;

        public Pair(BinaryTree.Node node) {
            this.node = node;
            this.level = 0;
        }

        public Pair(BinaryTree.Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public static ArrayList<ArrayList<Integer>> verticalOrder(BinaryTree.Node node) {

        int width = getWidth(node);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < width; i++)
            res.add(new ArrayList<>());
        LinkedList<Pair> queue = new LinkedList<>();
        queue.add(new Pair(node, -leftEnd));

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                Pair rp = queue.removeFirst();
                res.get(rp.level).add(rp.node.data);
                if (rp.node.left != null)
                    queue.addLast(new Pair(rp.node.left, rp.level - 1));
                if (rp.node.right != null)
                    queue.addLast(new Pair(rp.node.right, rp.level + 1));
            }
        }
        return res;
    }

    public static ArrayList<ArrayList<Integer>> verticalOrder(BinaryTree.Node node) {

        int width = getWidth(node);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < width; i++)
            res.add(new ArrayList<>());
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            return a.node.data - b.node.data;
        });
        LinkedList<Pair> queue = new LinkedList<>();
        queue.add(new Pair(node, -leftEnd));

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                Pair rp = queue.removeFirst();
                res.get(rp.level).add(rp.node.data);
                if (rp.node.left != null)
                    queue.addLast(new Pair(rp.node.left, rp.level - 1));
                if (rp.node.right != null)
                    queue.addLast(new Pair(rp.node.right, rp.level + 1));
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] preOrder = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, 60, 100, -1, -1, -1, 70, 110, -1, -1,
                120, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        tree.display();
        System.out.println(verticalOrder(tree.root));
    }

}
