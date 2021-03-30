public class FindSumInRotatedArray {
    public static void main(String[] args) {

    }

    public static boolean fun(int[] arr, int sum) {

        int pivotPosition = findPivot(arr, 0, arr.length - 1);
        int i = pivotPosition;
        int j = pivotPosition - 1;
        if (pivotPosition != arr.length) {
            pivotPosition++;
            i = pivotPosition;
            j = pivotPosition - 1;
        } else {
            i = 0;
            j = arr.length - 1;
        }

        while (true) {
            i = i % arr.length;
            j = (j + arr.length) % arr.length;
            if (arr[i] + arr[j] > sum) {

            } else if (arr[i] + arr[j] < sum) {

            } else {
                return true;
            }
        }
        return false;

    }

    public static int findPivot(int[] arr, int l, int r) {
        if (l > r)
            return -1;
        if (l == r) {
            if (l == arr.length - 1)
                return arr.length;
            else if (arr[l] < arr[l + 1])
                return -1;
        }
        int mid = (l + r) / 2;
        if (mid + 1 != arr.length && arr[mid] > arr[mid + 1])
            return mid;
        int res = findPivot(arr, l, mid - 1);
        if (res == -1)
            res = findPivot(arr, mid + 1, r);
        return res;
    }

}
