public class SumOfKsmallestEle {

    public static BinarySearchTree.Node rightMostOfLeft(BinarySearchTree.Node node, BinarySearchTree.Node curr) {
        BinarySearchTree.Node temp = node;
        while (temp.right != null && temp.right != curr)
            temp = temp.right;
        return temp;
    }

    public static int getkthSmallestEle(BinarySearchTree.Node curr, int k) {
        int count = 0;
        int sum = 0;
        BinarySearchTree.Node node = curr;
        while (node != null) {
            if (node.left == null) {
                count++;
                sum += node.data;
                if (count == k)
                    return sum;
                node = node.right;
            } else {
                BinarySearchTree.Node rightMost = rightMostOfLeft(node.left, node);
                if (rightMost.right == null) {
                    rightMost.right = node;
                    node = node.left;
                } else {
                    rightMost.right = null;
                    count++;
                    sum += node.data;
                    if (count == k)
                        return sum;
                    node = node.right;
                }
            }
        }
        return res.data;
    }

}
