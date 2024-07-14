class Solution {
    public int search(int[] nums, int target) {
        int check = -1;
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                check = i;
                break;
            }
        }
        return check;
    }
}