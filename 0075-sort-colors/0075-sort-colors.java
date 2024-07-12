class Solution {
    public void sortColors(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            int j = i;
            while(j > 0 && nums[j] < nums[j - 1]){
                int replace = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = replace;
                j--;
            }
        }
        
    }
}