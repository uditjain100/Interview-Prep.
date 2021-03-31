import java.util.ArrayList;

public class isMirrorGenericTree {

    public static class Node {
        int val;
        ArrayList<Node> childs;

        public Node(int val) {
            this.val = val;
            this.childs = new ArrayList<>();
        }
    }

    private Node root;

    public static void main(String[] args) {

    }

    public static void fun(Node root1 , Node root2){

        if(root1 == null && root2 == null) return true;
        if((root1 == null && root2 != null) || (root1 != null && root2 == null) || (root1.val !=  root2.val ))




    }

}
