public class Number_to_HexaDecimal {
    public String toHex(int num) {
        if(num == 0){
            return "0";
        }

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        while(num != 0){
            sb.append(hexChars[num & 15]);
            num >>>= 4;
        }
        return sb.reverse().toString();
    }
}
