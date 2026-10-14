public class No_of_steps_to_reduce_a_num_to_zero {
    public int numberOfSteps(int num) {
        if (num == 0) return 0;
        int res = 0;
        while (num != 0) {
            res += ((num & 1) != 0) ? 2 : 1;
            num >>= 1;
        }
        return res - 1;
    }
}
