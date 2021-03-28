public class ArrayToZigZag {

    // *** Wiggle Sort II

    public static void main(String[] args) {

    }

    public static int fun(int[] arr) {

    }

    public static int QuickSelect(int[] arr, int l, int r, int k) {
        int pivotPosition = Partition(arr, l, r);
        if (k - 1 < pivotPosition)
            return QuickSelect(arr, l, pivotPosition - 1, k);
        else if (k - 1 > pivotPosition)
            return QuickSelect(arr, pivotPosition + 1, r, k);
        else
            return arr[pivotPosition];
    }

    public static int Partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l;
        for (int j = i; j <= arr.length - 2; j++) {
            if (arr[j] < pivot) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return i;
    }

}
