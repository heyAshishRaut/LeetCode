class Solution {
    public String removeTrailingZeros(String num) {
        int minus = 0;
        for(int i = num.length() - 1; i >= 0; i--){
            if(num.charAt(i) == '0'){
                minus++;
            }
            else{
                break;
            }
        }
        int newSize = num.length() - minus;
        String result = "";
        for(int i = 0; i < newSize; i++){
            result = result + num.charAt(i);
        }
        return result;
    }
}