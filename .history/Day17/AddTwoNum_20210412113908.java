public class AddTwoNum {

    public static void add(int a, int b) {

        String str = "";

        int carry = 0;
        for (int i = 0; i < 32; i++) {
            int mask = (1 << i);
            int n1 = a & mask;
            int n2 = b & mask;
            if (carry == 0) {
                if (n1 == 0 && n2 == 0)
                    str = "0" + str;
                else if (n1 == 0 || n2 == 0)
                    str = "1" + str;
                else {
                    str = "1" + str;
                    carry = 1;
                }
            } else {
                if (n1 == 0 && n2 == 0) {
                    str = "1" + str;
                    carry = 0;
                } else if (n1 == 0 || n2 == 0)
                    str = "0" + str;
                else
                    str = "1" + str;
            }
        }
        if (carry = 1)
            stack.push(1);

        int num = 0;
        while (stack.IsEmpty()) {
            num *= 10;
            num += stack.pop();
        }

    }

}