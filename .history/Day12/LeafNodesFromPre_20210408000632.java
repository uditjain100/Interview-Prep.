public class LeafNodesFromPre {

    public static void printLeafNodes(int[] preOrder) {
        printLeaf(preOrder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int idx = 0;

    public static boolean printLeaf(int[] preOrder, int lb, int ub) {
        if (idx == preOrder.length || preOrder[idx] < lb || preOrder[idx] > ub)
            return true;

        int ele = preOrder[idx];
        idx++;
        boolean lr = printLeaf(preOrder, lb, ele);
        boolean rr = printLeaf(preOrder, ele, ub);

        if (lr && rr)
            System.out.println(ele);
        return false;
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 30, 50 };
        printLeafNodes(pre);
    }

}
