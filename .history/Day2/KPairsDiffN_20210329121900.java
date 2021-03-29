import java.util.HashSet;

public class KPairsDiffN {
    public static void main(String[] args) {

        fun(new int[] { 1, 3, 5, 6, 1, 2, 4, 5, 3, 6, 2, 1, 4, 5, 2, 9 });

    }

    public static void fun(int[] arr, int n) {

        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        set.addAll(arr);

        for (int ele : set)
            System.out.print(ele + "  ");

    }
}
