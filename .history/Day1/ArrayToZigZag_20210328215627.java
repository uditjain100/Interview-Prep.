public class ArrayToZigZag {

    // *** Wiggle Sort II

    public static void main(String[] args) {
        int[] arr = { 1, 5, 1, 1, 6, 4 };
        fun(arr);
        for (int ele : arr)
            System.out.print(ele + ", ");
    }

    public static void fun(int[] arr) {
        int mid = arr.length / 2;
        int median = QuickSelect(arr, 0, arr.length - 1, mid);
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            temp[i] = arr[i];
        int j = 0;
        for (int i = 0; i < mid; i++) {
            arr[j] = temp[i];
            j += 2;
        }
        j = 1;
        for (int i = mid; i < arr.length - 1; i++) {
            arr[j] = temp[i];
            j += 2;
        }
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
