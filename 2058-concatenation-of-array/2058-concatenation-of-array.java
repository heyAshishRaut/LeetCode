class Solution {
    public int[] getConcatenation(int[] nums) {
        int []ans = new int[2 * nums.length];
        int index = ans.length / 2;
        for(int i = 0; i < ans.length / 2; i++){
            ans[i] = nums[i];
            ans[index] = nums[i];
            index++;
        }
        return ans;
    }
}