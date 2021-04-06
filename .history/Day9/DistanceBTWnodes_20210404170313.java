public class DistanceBTWnodes {

    public static int finddistance(BinaryTree.Node root, int p, int q) {

        LCA lca = new LCA();
        lca.lowestCommonAncestor2(root, p, q);
        BinaryTree.Node lcaNode = lca.LCA;
        return dis(lcaNode, p) + dis(lcaNode, q) - 2;

    }

    public static int dis(BinaryTree.Node node, int target) {
        if (node == null)
            return 0;

        if (node.data == target)
            return 1;

        int ls = dis(node.left, target);
        if (ls != 0)
            return ls + 1;
        int rs = dis(node.right, target);
        if (rs != 0)
            return rs + 1;
        return rs;
    }

}
