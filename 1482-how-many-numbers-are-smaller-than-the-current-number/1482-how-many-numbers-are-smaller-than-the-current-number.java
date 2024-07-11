class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []A = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int pointer = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j] && i != j){
                    pointer++;
                }
            }
            A[i] = pointer;
        }
        return A;
    }
}