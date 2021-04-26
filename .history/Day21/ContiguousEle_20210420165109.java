import java.util.HashSet;

public class ContiguousEle {

    public static int fun(int[] arr) {
        int res = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i];
            int min = arr[i];
            HashSet<Integer> set = new HashSet<>();
            set.add(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                if (set.contains(arr[j]))
                    break;
                set.add(arr[j]);
                max = Math.max(max, arr[j]);
                min = Math.min(min, arr[j]);
                if (max - min == j - i)
                    res = Math.max(res, j - i + 1);
            }
        }
        return res;
    }

    public static String check(String str) {
        if (str.length() == 0)
            return str;

        String[] arr = str.split(" ");
        String res = "";
        for (String s : arr) {
            int len = s.length();
            len %= 26;
            for (char ch : s.toCharArray()) {
                int newCh = (int) (ch + len);
                if (ch >= 'a' && ch <= 'z') {
                    if (newCh > 122) {
                        newCh %= 123;
                        newCh += 97;
                    }
                } else {
                    if (newCh > 90) {
                        newCh %= 91;
                        newCh += 65;
                    }
                }
                res += (char) newCh;
            }
            res += " ";
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fun(new int[] { 10, 12, 12, 10, 10, 11, 10 }));
        System.out.println(check("Hi HeZl"));
    }

}
