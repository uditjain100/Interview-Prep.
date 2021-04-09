public class HeightOfFullBinaryTree {

    public static int height(String str) {
        return height(str.toCharArray());
    }

    public static int idx = 0;

    public static int height(char[] charArr) {
        if (charArr.length == idx || charArr[idx++] == 'l')
            return 0;

        return Math.max(height(charArr), height(charArr)) + 1;
    }

    public static void main(String[] args) {
        System.out.println(height("nlnnlll"));
    }

}
