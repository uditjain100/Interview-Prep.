public class TripletTo0 {

    public static void findTriplet(BinarySearchTree.Node node) {
        BinarySearchTree.Node head = BSTtoSortedDLL.DLLdisplay(node);
        BinarySearchTree.Node tail = head;
        while (tail.right != null)
            tail = tail.right;
        boolean res = false;
        BinarySearchTree.Node curr = head;
        for(curr != null)
            res = res || find(head,curr.data);
            return res;
    }

}
