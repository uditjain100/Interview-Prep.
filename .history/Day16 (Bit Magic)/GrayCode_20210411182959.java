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
            grayCode(n, i++, ans + "0", true);
            grayCode(n, i++, ans + "1", false);
        } else {
            grayCode(n, i++, ans + "1", false);
            grayCode(n, i++, ans + "0", true);
        }

    }

}
