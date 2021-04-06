public class HeightWithParentArray {

    public static int height(int[] arr) {
        int[] res = new int[arr.length];
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            int child = i;
            int parent = arr[child];
            while (parent != -1) {
                count++;
                child = parent;
                parent = arr[child];
            }
            res[i] = count;
        }

        for (int ele : res)
            max = Math.max(max, ele);
        return max;
    }

    public static void main(String[] args) {
        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        int[] parentArr = BinaryTreeParent.createParentArray(tree.root, tree.size());
        for (int ele : parentArr)
            System.out.print(ele + ", ");
        System.out.println();
        height(parentArr);
    }

}
