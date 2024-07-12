class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        for(int i = 0; i < s.length() - 1; i++){
            int char01 = (int)s.charAt(i);
            int char02 = (int)s.charAt(i + 1);
            int temp_ans = char01 - char02;
            ans = ans + Math.abs(temp_ans);
        }
        return ans;
    }
}