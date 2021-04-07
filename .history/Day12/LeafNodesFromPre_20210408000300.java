public class LeafNodesFromPre {

    public static void printLeafNodes(int[] preOrder) {
        printLeaf(preOrder, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static int idx = 0;

    public static boolean printLeaf(int[] preOrder, int lb, int ub) {
        if (idx == preOrder.length || preOrder[idx] < lb || preOrder[idx] > ub)
            return true;

        idx++;

    }

}
