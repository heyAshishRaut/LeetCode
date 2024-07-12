class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = -1;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            return word;
        }
        String ans = "";
        for(int i = idx; i >= 0; i--){
            ans = ans + word.charAt(i);
        }
        ans = ans + word.substring(idx + 1, word.length());
        return ans;
    }
}