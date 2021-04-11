public class NLevels {
    
    public static boolean check(int[] arr) {
        return checkIfCan(arr, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int idx = 0;

    public static boolean checkIfCan(int[] arr, int lb, int ub) {
        if (idx == arr.length)
            return true;
        if (arr[idx] < lb || arr[idx] > ub)
            return false;
        idx++;
        if (idx == arr.length)
            return true;

        if (arr[idx] < arr[idx - 1])
            return checkIfCan(arr, lb, arr[idx - 1]);
        else
            return checkIfCan(arr, arr[idx - 1], ub);
    }

    public static void main(String[] args) {
        System.out.println(check(new int[] { 512, 330, 78, 11, 8 }));
    }

}
