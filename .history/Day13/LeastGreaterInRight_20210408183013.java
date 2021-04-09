import java.util.ArrayList;

public class LeastGreaterInRight {

    public static int succ = -1;

    public static ArrayList<Integer> filter(int[] arr) {
        BinarySearchTree tree = new BinarySearchTree();
        for (int ele : arr) {
            succ = -1;
            tree.add(ele);
        }
        res.clear();
        preOrder(tree.root);
        return res;
    }

    public static ArrayList<Integer> res = new ArrayList<>();

    public static void replaceSucc(BinarySearchTree.Node curr, int data) {
        while (curr != null) {
            if (curr.data > data) {
                succ = Math.min(succ, curr.data);
                curr = curr.left;
            } else if (curr.data < data)
                curr = curr.right;
            else
                res.add(succ);
        }
    }

    public static void main(String[] args) {
        System.out.println(filter(new int[] { 8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28 }));
    }

}
