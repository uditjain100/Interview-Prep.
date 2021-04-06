public class HeightWithParentArray {

    public static int height(int[] arr) {

        int[] res = new int[arr.length];
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            int child = i;
            int parent = arr[child];
            while (parent != -1) {
                count++;
                child = parent;
                parent = arr[child];
            }
            res[i] = count;
        }

        for (int ele : res)
            max = Math.max(max, ele);
        return max;

    }

}
