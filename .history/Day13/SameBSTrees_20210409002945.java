public class SameBSTrees {

    public static boolean checkIfSame(int[] a, int[] b) {

        return true;
    }

    public static void main(String[] args) {
        int[] a = { 8, 3, 6, 1, 4, 7, 10, 14, 13 };
        int[] b = { 8, 10, 14, 3, 6, 4, 1, 7, 13 };
        boolean ans = checkIfSame(a, b);
        System.out.println(ans);
    }

}
