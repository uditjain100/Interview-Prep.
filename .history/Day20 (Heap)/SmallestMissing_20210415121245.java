public class SmallestMissing {

    public static void fun(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 || arr[i] >= arr.length)
                arr[i] = -1;
            else {
                int idx = i;
                while (arr[idx] >= 0 && arr[idx] < arr.length) {
                    int temp = arr[idx];
                    arr[idx] = -1;
                    idx = temp;
                }
                arr[idx] = -1;
            }
        }

        System.out.println();
        for (int ele : arr)
            System.out.print(ele + ", ");
        System.out.println();

        int res = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                res = arr[i];
                break;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        fun(new int[] { 2, 3, 7, 6, 8, -1, -10, 15 });
    }

}
