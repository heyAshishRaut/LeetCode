class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []array = new int[2];
        int index = 0;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length ; j++){
                if(target == nums[i] + nums[j]){
                    array[index++] = i;
                    array[index] = j;
                }
            }
        }
//        for(int i = 0; i < array.length; i++){
//            System.out.print(array[i] + "  ");
//        }
        return array;
    }
}