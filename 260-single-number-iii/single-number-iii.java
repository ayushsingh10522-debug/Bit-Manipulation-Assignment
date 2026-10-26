class Solution {
    public int[] singleNumber(int[] nums) {
        long xorAll = 0;
        for (int num : nums) {
            xorAll ^= num;
        }
        
        long diffBit = xorAll & -xorAll;
        
        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & diffBit) != 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        
        return new int[] {a, b};
    }
}