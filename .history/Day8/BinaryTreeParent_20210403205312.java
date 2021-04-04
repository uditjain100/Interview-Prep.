public class BinaryTreeParent {

    public static class ParNode {
        int data;
        ParNode left;
        ParNode right;

        public ParNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static ParNode root;

    public BinaryTreeParent(int[] arr) {
        root = constructor(arr);
    }

    public static ParNode constructor(int[] arr) {

        boolean[] parent = new boolean[arr.length];
        ParNode[] nodeArr = new ParNode[arr.length];

        for (int i = 0; i < arr.length; i++)
            nodeArr = new ParNode(i);

        MatNode main_root = null;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                main_root = nodeArr[i];
                continue;
            }

            if (nodeArr[arr[i]].left == null)
                nodeArr[arr[i]].left = nodeArr[i];
            else
                nodeArr[arr[i]].right = nodeArr[i];
        }
        return main_root;
    }

    public static int[] createParentArray(BinaryTree.Node node, int size) {
        int[] res = new int[size + 1];
        res[node.data] = -1;
        createParentArray(node, res);
        return res;
    }

    public static void createParentArray(BinaryTree.Node node, int[] arr) {
        if (node == null)
            return;

        if (node.left != null)
            arr[node.left.data] = node.data;
        if (node.right != null)
            arr[node.right.data] = node.data;
        createParentArray(node.left, arr);
        createParentArray(node.right, arr);
    }

    public static void display() {
        display(root);
    }

    private static void display(ParNode node) {
        if (node == null)
            return;

        String str = node.data + " => ";

        if (node.left != null)
            str += node.left.data + ", ";
        if (node.right != null)
            str += node.right.data + ", ";

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {

        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        int[] parentArr = createParentArray(tree.root, tree.size());
        for (int ele : parentArr)
            System.out.print(ele + ", ");
        System.out.println();

        BinaryTreeParent ptree = new BinaryTreeParent(parentArr);
        ptree.display();
    }

}
