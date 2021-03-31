public class LeftChildRightSibling extends GenericTree {
    public static void main(String[] args) {
        int[] preOrder = { 1, 2, 5, 6, 7, 3, 8, 9, 10, 4, 11, 12, 13 };
        GenericTree tree = new GenericTree(preOrder, 3);
        tree.display();
    }

    public static Node fun(Node node) {

        for (Node child : node.childs) {

        }

    }

}
