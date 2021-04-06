public class DeepestLeafNode {

    public static BinaryTree.Node leaf = null;
    public static int max = Integer.MIN_VALUE;

    public static void deepestLeaf(BinaryTree.Node node) {
        deepestLeaf(node, 0, false);
    }

    public static void deepestLeaf(BinaryTree.Node node, int level, boolean isLeft) {

        if(node == null) return;
        if(isLeft && node.left == null && node.right == null){
            if(max < level + 1)
        } 
    }

    public static void main(String[] args) {

    }
}
