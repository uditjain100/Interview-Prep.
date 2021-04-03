public class LevelOrder {

    public static ArrayList<ArrayList<Integer>> verticalOrder(BinaryTree.Node node) {

        int width = getWidth(node);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= rightEnd; i++)
            res.add(new ArrayList<>());
        LinkedList<Pair> queue = new LinkedList<>();
        queue.add(new Pair(node, 0));

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                Pair rp = queue.removeFirst();
                res.get(rp.level).add(rp.node.data);
                if (rp.node.left != null)
                    queue.addLast(new Pair(rp.node.left, rp.level));
                if (rp.node.right != null)
                    queue.addLast(new Pair(rp.node.right, rp.level + 1));
            }
        }
        return res;
    }

}
