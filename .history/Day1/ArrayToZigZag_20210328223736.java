public class ArrayToZigZag {

    // *** Wiggle Sort II

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 1, 2, 2, 1 };
        fun(arr);
        for (int ele : arr)
            System.out.print(ele + ", ");
    }

    public static void fun(int[] arr) {
        int mid = (arr.length + 1) / 2;
        int median = QuickSelect(arr, 0, arr.length - 1, mid);
        int[] temp = new int[arr.length];

        int s = 0;
        int e = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < median)
                temp[s++] = arr[i];
            else if (arr[i] > median)
                temp[e--] = arr[i];
        }
        while (s < mid)
            temp[s++] = median;
        while (e >= mid)
            temp[e--] = median;

        s = mid - 1;
        e = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                arr[i] = temp[s--];
            else
                arr[i] = temp[e--];
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
