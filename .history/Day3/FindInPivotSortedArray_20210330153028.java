public class FindInPivotSortedArray {
    public static void main(String[] args) {

    }

    public static int binarySearch(int[] arr, int l, int r, int ele) {
        if (l > r)
            return -1;
        int mid = arr.length / 2;
        if (arr[mid] > ele)
            return binarySearch(arr, l, mid - 1, ele);
        else if (arr[mid] < ele)
            return binarySearch(arr, mid + 1, r, ele);
        else
            return mid;
    }
}
