import java.util.ArrayList;

public class ReverseTreePath {

    public static void reverse(BinaryTree.Node node, int target) {
        ArrayList<BinaryTree.Node> path = reversePath(node, target);
        System.out.println();
        for (BinaryTree.Node n : path)
            System.out.print(n.data + ", ");
        System.out.println();
        int i = 0;
        int j = path.size() - 1;
        while (i < j) {
            int temp = path.get(i).data;
            path.get(i).data = path.get(j).data;
            path.get(j).data = temp;
            i++;
            j--;
        }
    }

    public static ArrayList<BinaryTree.Node> reversePath(BinaryTree.Node node, int target) {
        ArrayList<BinaryTree.Node> res = new ArrayList<>();

        if (node == null)
            return res;
        if (node.data == target) {
            res.add(node);
            return res;
        }

        res = reversePath(node.left, target);
        if (res.size() != 0) {
            res.add(node);
            return res;
        }
        res = reversePath(node.right, target);
        if (res.size() != 0)
            res.add(node);
        return res;
    }

    public static void main(String[] args) {
        int[] preOrder = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, 60, 100, -1, -1, -1, 70, 110, -1, -1,
                120, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        tree.display();
        reverse(tree.root, 10);
        tree.display();
    }

}
