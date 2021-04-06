public class HeightWithParentArray {

    public static int height(int[] arr) {

        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int count = 1;
            int child = i;
            int parent = arr[child];
            while (parent != -1) {
                child = parent;
                parent = arr[child];
            }

        }

    }

}
