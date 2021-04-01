import java.util.ArrayList;

public class GTreewithLock {

    public static class Node {
        int data;
        ArrayList<Node> childs;

        public Node(int data) {
            this.data = data;
            this.childs = new ArrayList<>();
        }
    }

}
