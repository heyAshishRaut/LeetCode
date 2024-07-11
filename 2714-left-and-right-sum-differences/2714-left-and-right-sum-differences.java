class Solution {
    public int[] leftRightDifference(int[] nums) {
        int size = nums.length;

        int []left = new int[size];
        int []right = new int[size];

        left[0] = 0;
        right[size - 1] = 0;

        for(int i = 1; i < size; i++){
            left[i] = nums[i - 1] + left[i - 1];
        }

        for(int i = size - 2; i >= 0; i--){
            right[i] = nums[i + 1] + right[i + 1];
        }

        int []ans = new int[size];
        for(int i = 0; i < size; i++){
            int value = left[i] - right[i];
            ans[i] = Math.abs(value);
        }

        return ans;
    }
}