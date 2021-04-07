public class Median {

    public static int findMedian(BinarySearchTree.Node node, int size) {
        if (size % 2 == 0)
            return (kthLargestEle.getkthSmallestEle(node, size / 2)
                    + kthLargestEle.getkthSmallestEle(node, (size + 1) / 2)) / 2;
        else
            return kthLargestEle.getkthSmallestEle(node, size / 2);
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 20, 8, 4, 12, 10, 14, 22 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        System.out.println(findMedian(tree.root, tree.size()));
    }

}
