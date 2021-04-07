public class TripletTo0 {

    public static boolean findTriplet(BinarySearchTree.Node node) {
        BinarySearchTree.Node head = BSTtoSortedDLL.DLLdisplay(node);
        BinarySearchTree.Node tail = head;
        while (tail.right != null)
            tail = tail.right;
        boolean res = false;
        BinarySearchTree.Node curr = head;
        while (curr != null) {
            res = res || find(head, tail, curr.data);
            curr = curr.right;
        }
        System.out.println(curr);
        return res;
    }

    public static boolean find(BinarySearchTree.Node head, BinarySearchTree.Node tail, int currData) {
        BinarySearchTree.Node l = head;
        BinarySearchTree.Node r = tail;
        while (l.data < r.data) {
            if (l.data == currData) {
                l = l.right;
                continue;
            }
            if (r.data == currData) {
                r = r.left;
                continue;
            }
            if (l.data + r.data > currData)
                r = r.left;
            else if (l.data + r.data < currData)
                l = l.right;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 6, -13, -8, 14, 13, 8, 15 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        System.out.println(findTriplet(tree.root));
    }

}
