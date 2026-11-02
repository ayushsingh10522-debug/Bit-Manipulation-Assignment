public class Sum_Of_Two_Integers {
    public int getSum(int a, int b) {
        int carry;
        while (b != 0) {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
