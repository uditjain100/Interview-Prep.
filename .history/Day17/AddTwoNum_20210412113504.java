public class AddTwoNum {

    public static void add(int a, int b) {

        Stack<Integer> stack = new Stack<>();

        int carry = 0;
        for (int i = 0; i < 32; i++) {
            int mask = (1 << i);
            int n1 = a & mask;
            int n2 = b & mask;
            if (carry == 0) {
                if (n1 == 0 && n2 == 0)
                    stack.push(0);
                else if (n1 == 0 || n2 == 0)
                    stack.push(1);
                else {
                    stack.push(1);
                    carry = 1;
                }
            } else {
                if (n1 == 0 && n2 == 0) {

                } else if (n1 == 0 || n2 == 0) {

                } else {

                }
            }
        }

    }

}