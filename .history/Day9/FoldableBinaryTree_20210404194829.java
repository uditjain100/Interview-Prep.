public class FoldableBinaryTree {

    public static boolean isFoldable(BinaryTree.Node node) {
        if (node == null || (node.left == null && node.right == null))
            return true;
        if ((node.left != null && node.right == null) || (node.left == null && node.right != null))
            return false;
    }

    public stativ boolean isMirror(BinaryTree.Node node1,BinaryTree.Node node2 ){
        
    }

    public static void main(String[] args) {

    }

}
