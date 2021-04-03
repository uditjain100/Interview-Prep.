import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BinaryTreeConstruct {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node root;

    public BinaryTreeConstruct(int[] pre, char[] preLN) {
        root = constructor(pre, preLN);
    }

    public static int index = 0;

    public static Node constructor(int[] pre, char[] preLN) {
        Node nn = new Node(pre[index]);

        if (preLN[index++] == 'L')
            return nn;

        if (index < pre.length)
            nn.left = constructor(pre, preLN);
        if (index < pre.length)
            nn.right = constructor(pre, preLN);
        return nn;
    }

    public BinaryTreeConstruct(int[] order1, int[] order2) {
        root = constructorUsingPreAndIn(order1, 0, order1.length - 1, order2, 0, order2.length - 1);
        // root = constructorUsingPostAndIn(order1, 0, order1.length - 1, order2, 0,
        // order2.length - 1);
        // root = constructorUsingPreAndPost(order1, 0, order1.length - 1, order2, 0,
        // order2.length - 1);
    }

    public static Node constructorUsingPreAndIn(int[] pre, int psi, int pei, int[] in, int isi, int iei) {
        if (isi > iei || psi > pei)
            return null;

        Node nn = new Node(pre[psi]);

        int idx = isi;
        while (pre[psi] != in[idx])
            idx++;

        int totalElements = idx - isi;

        nn.left = constructorUsingPreAndIn(pre, psi + 1, psi + totalElements, in, isi, idx - 1);
        nn.right = constructorUsingPreAndIn(pre, psi + totalElements + 1, pei, in, idx + 1, iei);
        return nn;
    }

    public static Node constructorUsingPostAndIn(int[] post, int psi, int pei, int[] in, int isi, int iei) {
        if (isi > iei || psi > pei)
            return null;

        Node nn = new Node(post[pei]);

        int idx = isi;
        while (post[psi] != in[idx])
            idx++;

        int totalElements = idx - isi;

        nn.left = constructorUsingPostAndIn(post, psi + 1, psi + totalElements, in, isi, idx - 1);
        nn.right = constructorUsingPostAndIn(post, psi + totalElements + 1, pei, in, idx + 1, iei);
        return nn;
    }

    public static Node constructorUsingPreAndPost(int[] pre, int psi, int pei, int[] in, int isi, int iei) {
        return null;
    }

    public static void display() {
        display(root);
    }

    private static void display(Node node) {
        if (node == null)
            return;

        String str = node.data + " => ";

        if (node.left != null)
            str += node.left.data + ", ";
        if (node.right != null)
            str += node.right.data + ", ";

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {

        int pre[] = new int[] { 10, 30, 20, 5, 15 };
        char preLN[] = new char[] { 'N', 'N', 'L', 'L', 'L' };
        BinaryTreeConstruct btree = new BinaryTreeConstruct(pre, preLN);
        btree.display();

        int[] preorder = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, 60, 100, -1, -1, -1, 70, 110, -1, -1,
                120, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        ArrayList<Integer> preOrder = tree.preOrder();
        ArrayList<Integer> inOrder = tree.inOrder();
        ArrayList<Integer> postOrder = tree.postOrder();

        System.out.println(preOrder);
        System.out.println(inOrder);
        System.out.println(postOrder);

        int[] pre2 = new int[preOrder.size()];
        int[] in2 = new int[inOrder.size()];
        int[] post2 = new int[postOrder.size()];

        int i = 0;
        for (int ele : preOrder)
            pre2[i++] = ele;
        i = 0;
        for (int ele : preOrder)
            pre2[i++] = ele;
        i = 0;
        for (int ele : preOrder)
            pre2[i++] = ele;

    }

}
