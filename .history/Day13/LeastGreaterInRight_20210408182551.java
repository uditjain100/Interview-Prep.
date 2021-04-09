public class LeastGreaterInRight {

    public static int succ = -1;

    public static int[] filter(int[] arr) {
        BinarySearchTree tree = new BinarySearchTree();
        for (int ele : arr) {
            succ = -1;
            tree.add(ele);
        }
        tree.display();
        return new int[0];
    }

    public static void replaceSucc(BinarySearchTree.Node curr, int data) {
        while (curr != null) {
            if (curr.data > data) {
                succ = Math.min(succ, curr.data);
                curr = curr.left;
            } else if (curr.data < data)
                curr = curr.right;
            else
                node.data = succ;
        }
    }

    public static void main(String[] args) {
        filter(new int[] { 8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28 });
    }

}
