class Solution {
    public int smallestEvenMultiple(int n) {
        int num = n;
        int ans = -1;
        for(int i = 2; ; i++){
            if(num % n == 0 && num % 2 == 0){
                ans = num;
                break;
            }
            else{
                num++;
            }
        }
        return ans;
        
    }
}