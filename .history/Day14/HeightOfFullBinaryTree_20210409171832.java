public class HeightOfFullBinaryTree {

    public static int height(String str) {
        return height(str.toCharArray());
    }

    public static int idx = 0;

    public static int height(char[] charArr) {
        if (charArr.length == idx)
            return 0;

        char curr = charArr[idx];
        if (curr == 'l')
            return 0;

        char left = charArr[idx + 1];
        char right = charArr[idx + 2];

        int lh = height(charArr);

    }

}
