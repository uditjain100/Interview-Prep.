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
            while (size-- > 0) {
                BinaryTree.Node rn = queue.removeFirst();
                if (size == 0)
                    res.add(rn.data);
                if (rn.left != null)
                    queue.addLast(rn.left);
                if (rn.right != null)
                    queue.addLast(rn.right);
            }
        }
        return res;
    }

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

    public static ArrayList<Integer> topView(BinaryTree.Node node) {

        int width = getWidth(node);
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i <= width; i++)
            res.add(-1);
        LinkedList<Pair> queue = new LinkedList<>();
        queue.add(new Pair(node));

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                Pair rp = queue.removeFirst();
                if (res.get(rp.level) == -1)
                    res.set(rp.level, rp.node.data);
                if (rp.node.left != null)
                    queue.addLast(new Pair(rp.node.left, rp.level - 1 + width - 1));
                if (rp.node.right != null)
                    queue.addLast(new Pair(rp.node.right, rp.level + 1 + width - 1));
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] preOrder = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, 60, 100, -1, -1, -1, 70, 110, -1, -1,
                120, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        tree.display();
        System.out.println(leftView(tree.root));
        System.out.println(rightView(tree.root));
        System.out.println(topView(tree.root));
    }

}
