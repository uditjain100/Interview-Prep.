import java.util.ArrayList;

public class ReverseTreePath {

    public static void reverse(BinaryTree.Node node, int target) {
        ArrayList<BinaryTree.Node> path = reversePath(node, target);
        for (BinaryTree.Node n : path)
            System.out.print(n.data + ", ");
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
        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        reverse(tree.root, 10);
        tree.display();
    }

}
