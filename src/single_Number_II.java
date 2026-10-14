public class single_Number_II {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int bIdx = 0; bIdx <= 31; bIdx++){
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                if((nums[i] & (1<<bIdx)) != 0)
                    count++;
            }

            if(count % 3 == 1){
                ans = ans | (1<<bIdx);
            }
        }
        return ans;
    }
}
