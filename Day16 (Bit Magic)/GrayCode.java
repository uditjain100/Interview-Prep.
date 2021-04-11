public class GrayCode {

    public static void grayCode(int n) {
        grayCode(n, 0, "", true);
    }

    public static void grayCode(int n, int i, String ans, boolean isLeft) {
        if (i == n) {
            System.out.println(ans);
            return;
        }
        if (isLeft) {
            grayCode(n, i + 1, ans + "0", true);
            grayCode(n, i + 1, ans + "1", false);
        } else {
            grayCode(n, i + 1, ans + "1", true);
            grayCode(n, i + 1, ans + "0", false);
        }

    }

    public static void main(String[] args) {
        grayCode(4);
    }

}
