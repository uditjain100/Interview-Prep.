import java.util.ArrayList;

public class LeastGreaterOnRight {

    public static void filter(int[] arr) {
        BinarySearchTree tree = new BinarySearchTree(arr);
        reverseInOrder(tree.root);
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

    public static void reverseInOrder(BinarySearchTree.Node node) {
        if (node == null)
            return;

        reverseInOrder(node.right);

        int temp = node.data;
        node.data = prev;
        prev = temp;

        reverseInOrder(node.left);
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28 };
        filter(pre);
        System.out.println();
        for (int ele : pre)
            System.out.print(ele + ", ");
        System.out.println();
    }

}
