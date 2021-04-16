public class SmallestMissing {

    public static void fun(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i];
            while (idx >= 0 && idx < arr.length) {
                int temp = arr[idx];
                arr[idx] = -1;
                idx = temp;
            }
            System.out.println();
            for (int ele : arr)
                System.out.print(ele + ", ");
            System.out.println();
        }

        int res = arr.length;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= 0) {
                res = i;
                break;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        fun(new int[] { 2, 3, 7, 6, 8, -1, -10, 15 });
    }

}
