public class LeastGreaterInRight {

    public static int[] filter(int[] arr) {
        BinarySearchTree tree = new BinarySearchTree();
        for (int ele : arr)
            tree.add(ele);
        tree.display();
        return new int[0];
    }

    public static void main(String[] args) {

    }

}
