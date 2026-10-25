public class prime_Number_of_SetBits_In_B_Representation {
    public boolean prime(int n){
        boolean isprime = true;
        if(n <= 1){
            isprime = false;
        }

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                isprime = false;
            }
        }

        return isprime;
    }

    public int countPrimeSetBits(int left, int right) {

        int res_cnt = 0;

        while(left <= right){
            int cnt = 0;
            int n = left;

            while(n != 0){
                cnt = cnt + (n & 1);
                n = n >>> 1;
            }

            boolean is_prime = prime(cnt);

            if(is_prime){
                res_cnt++;
            }

            left++;
        }

        return res_cnt;


        // Set<Integer> prime = Set.of(2, 3, 5, 7, 11, 13, 17, 19);
        // int count = 0;
        // for(int i = left; i <= right; i++){
        //     if(prime.contains(Integer.bitCount(i))){
        //         count++;
        //     }
        // }
        // return count;
    }
}
