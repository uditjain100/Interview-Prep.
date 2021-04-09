import java.util.ArrayList;

public class LeastGreaterOnRight {

    public static void filter(int[] arr) {
        BinarySearchTree tree = new BinarySearchTree(arr);
        inOrder(tree.root);
        res.clear();
        preOrder(tree.root);
        for (int i = 0; i < arr.length; i++)
            arr[i] = res.get(i);
    }

    public static ArrayList<Integer> res = new ArrayList<>();

    public static void preOrder(BinarySearchTree.Node node) {
        if (node == null)
            return;
        res.add(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static int prev = -1;

    public static void inOrder(BinarySearchTree.Node node) {
        if (node == null)
            return;

        inOrder(node.right);

        int temp = node.data;
        node.data = prev;
        prev = temp;

        inOrder(node.left);
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 30, 50 };
        filter(pre);
        System.out.println();
        for (int ele : pre)
            System.out.print(ele + ", ");
        System.out.println();
    }

}
