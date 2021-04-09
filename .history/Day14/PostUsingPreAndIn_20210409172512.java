public class PostUsingPreAndIn {

    public static void getPostOrder(int[] pre, int[] in) {
        getPostOrder(pre, in, 0, pre.length - 1);
    }

}
