public class LeastGreaterInRight {

    public static int[] filter(int[] arr) {
        BinarySearchTree tree = new BinarySearchTree();
        for (int ele : arr)
            tree.add(ele);
        tree.display();
        return new int[0];
    }

    public static void main(String[] args) {
        filter(new int[] { 8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28 });
    }

}
