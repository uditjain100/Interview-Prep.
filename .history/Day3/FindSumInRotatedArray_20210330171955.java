public class FindSumInRotatedArray {
    public static void main(String[] args) {

    }

    public static void fun(int[] arr) {

        int pivotPosition = findPivot(arr, 0, arr.length - 1);

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
