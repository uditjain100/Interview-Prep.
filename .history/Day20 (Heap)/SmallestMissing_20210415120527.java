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
            }
        }

    }

}
