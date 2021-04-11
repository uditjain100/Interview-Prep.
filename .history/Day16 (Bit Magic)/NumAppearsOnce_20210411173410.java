public class NumAppearsOnce {

    public static int get(int[] arr) {
        String bs = "";
        for (int i = 0; i < 32; i++) {
            int mask = (1 << i);
            int count = 0;
            for (int ele : arr)
                count += (ele & mask);
            if (count % 3 == 0)
                bs = "0" + bs;
            else
                bs = "1" + bs;
        }
        return Integer.parseInt(bs, 2);

    }

    public static void main(String[] args) {
        System.out.println(get(new int[] { 12, 1, 12, 3, 12, 1, 1, 202, 3, 3 }));
    }

}
