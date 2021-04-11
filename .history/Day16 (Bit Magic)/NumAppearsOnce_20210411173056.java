public class NumAppearsOnce {

    public static int get(int[] arr) {

        String bs = "";
        for (int i = 0; i < 32; i++) {
            int mask = (1 << i);
            int count = 0;
            for (int ele : arr)
                count += (ele & mask);
            if (count % 3 == 0)
                bs += "0";
            else
                bs += "1";
        }

    }

}
