public class Number_Compliment {
    public int findComplement(int num) {
        int bM = 0;
        int temp = num;

        while(temp > 0){
            bM = (bM << 1) | 1;
            temp = temp >> 1;
        }
        return num ^ bM;
    }
}
