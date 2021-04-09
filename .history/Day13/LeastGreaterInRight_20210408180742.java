public class LeastGreaterInRight {

    public static int[] filter(int[] arr) {
        BinarySearchTree tree = new BinarySearchTree();
        for (int ele : arr)
            tree.add(ele);
        tree.display();
    }

}
