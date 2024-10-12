class Solution {
    public int findDuplicate(int[] nums) {
        // for(int i = 0; i < nums.length - 1; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return 0;

        HashSet<Integer> h = new HashSet<>();
        for(int i : nums){
            if(h.contains(i)){
                return i;
            }
            else{
                h.add(i);
            }
        }
        return 0;
    }
}