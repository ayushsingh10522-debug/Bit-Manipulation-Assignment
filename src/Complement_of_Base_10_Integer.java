public class Complement_of_Base_10_Integer {
    public int bitwiseComplement(int n) {
        if(n == 0){
            return 1;
        }

        int bM = 1;
        while(bM < n){
            bM = (bM << 1) | 1;
        }
        return bM ^ n;
    }
}
