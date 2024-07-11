class Solution {
    public int majorityElement(int[] nums){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        int value = 0;
        int result = 0;
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if (e.getValue() > value) {
                value = e.getValue();
                result = e.getKey();
            }
        }
        return result;
    }
}