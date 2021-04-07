import java.util.ArrayList;

public class LeafNodesFromPre {

    public static ArrayList<Integer> leafNodes = new ArrayList<>();

    public static ArrayList<Integer> printLeafNodes(int[] preOrder) {
        leafNodes.clear();
        printLeaf(preOrder, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return leafNodes;
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
            leafNodes.add(ele);
        return false;
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 30, 50 };
        printLeafNodes(pre);
    }

}
