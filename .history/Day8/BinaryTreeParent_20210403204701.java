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

            if (nodeArr[arr[i]] == null) {
                ParNode nn = new ParNode(arr[i]);
                nn.left = nodeArr[i];
            } else {
            }
        }

    }

    public static int[] createParentArray(BinaryTree.Node node, int size) {
        int[] res = new int[size + 1];
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

}
