import java.util.ArrayList;

public class GTreewithLock {

    public static class Node {
        int data;
        ArrayList<Node> childs;
        boolean isLocked;
        Node parent;
        int lockedChilds;

        public Node(int data) {
            this.data = data;
            this.childs = new ArrayList<>();
            this.isLocked = false;
            this.parent = null;
            this.lockedChilds = 0;
        }
    }

    private static Node root;

    public GTreewithLock(int[] preOrder) {
        root = construct(preOrder);
    }

    public static Node construct() {

    }

}
