public class Minimum_Bit_Flips_to_Convert_Number {
    public int minBitFlips(int start, int goal) {
        int xor = start ^  goal;
        int flips =  0;
        while (xor > 0) {
            xor = xor & (xor - 1);
            flips++;
        }
        return flips;
    }
}
