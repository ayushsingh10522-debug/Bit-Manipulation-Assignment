public class Binary_Gap {
    public int binaryGap(int n){
        int maxGap = 0;
        int lastPos = -1;
        int currentPos = 0;

        while(n != 0){
            if((n & 1) == 1 && lastPos != -1){
                maxGap = Math.max(maxGap, currentPos - lastPos);
                lastPos = currentPos;
            }
            if((n & 1) == 1){
                lastPos = currentPos;
            }

            currentPos++;
            n = n>>>1;
        }
        return maxGap;
    }
}
