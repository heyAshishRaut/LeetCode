class Solution {
    public int smallestEvenMultiple(int n) {
        int divisibleNum = 1;
        int ans = 0;

        while(divisibleNum >= 0){
            if(divisibleNum % n == 0 && divisibleNum % 2 == 0){
                ans = divisibleNum;
                break;
            }
            divisibleNum++;
        }
        return ans;
    }
}