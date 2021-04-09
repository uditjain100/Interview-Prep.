import java.util.ArrayList;

public class PreDLLofBinaryTree {

    // ***
    // https://www.geeksforgeeks.org/modify-binary-tree-get-preorder-traversal-using-right-pointers/

    public static BinaryTree.Node DLLhead = null;
    public static BinaryTree.Node DLLprev = null;

    public static void DLL(BinaryTree.Node node) {
        if (node == null)
            return;

        BinaryTree.Node left = node.left;
        BinaryTree.Node right = node.right;

        node.left = null;
        node.right = null;

        if (DLLhead == null) {
            DLLhead = node;
        } else {
            DLLprev.right = node;
            node.left = DLLprev;
        }
        DLLprev = node;

        DLL(left);
        DLL(right);
    }

    public static void preOrderFromRight(BinaryTree.Node node) {
        DLL(node);
        BinaryTree.Node curr = DLLhead;
        ArrayList<Integer> res = new ArrayList<>();
        while (curr != null) {
            res.add(curr.data);
            curr = curr.right;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int[] preOrder = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, 60, 100, -1, -1, -1, 70, 110, -1, -1,
                120, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        tree.display();
        preOrderFromRight(tree.root);
    }

}
