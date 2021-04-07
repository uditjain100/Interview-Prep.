public class Median {

    public static int findMedian(BinarySearchTree.Node node, int size) {

        if (size % 2 == 0) {
            return kthLargestEle.getKthLargestElemwnt(node, size / 2)
        } else {
            return kthLargestEle.getkthSmallestEle(node, size / 2);
        }

    }

}
