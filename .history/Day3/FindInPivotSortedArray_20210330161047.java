public class FindInPivotSortedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int ans = fun(arr, 3);
        System.out.println(ans);
    }

    public static int fun(int[] arr, int ele) {
        int pivotPosition = findPivot(arr, 0, arr.length - 1);
        int res = binarySearch(arr, 0, pivotPosition, ele);
        if (res == -1)
            res = binarySearch(arr, pivotPosition, arr.length - 1, ele);
        return res;
    }

    public static int findPivot(int[] arr, int l, int r) {
        if (l > r || (l == r && (l == arr.length - 1 || arr[l] < arr[l + 1])))
            return -1;
        int mid = (l + r) / 2;
        if (mid + 1 != arr.length && arr[mid] > arr[mid + 1])
            return mid;
        int res = findPivot(arr, l, mid - 1);
        if (res == -1)
            res = findPivot(arr, mid + 1, r);
        return res;
    }

    public static int binarySearch(int[] arr, int l, int r, int ele) {
        if (l > r)
            return -1;
        int mid = (l + r) / 2;
        if (arr[mid] > ele)
            return binarySearch(arr, l, mid - 1, ele);
        else if (arr[mid] < ele)
            return binarySearch(arr, mid + 1, r, ele);
        else
            return mid;
    }
}
