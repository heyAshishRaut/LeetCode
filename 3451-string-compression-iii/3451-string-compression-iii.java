class Solution {
    public String compressedString(String word) {
        String ans = "";
        Stack<Character> s = new Stack<>();
        s.push(word.charAt(0));
        for(int i = 1; i < word.length(); i++){
            char current = word.charAt(i);
            if(current != s.peek() || s.size() == 9){
                ans = ans + s.size() + s.peek();
                while(!s.isEmpty()){
                    s.pop();
                }
            }
            s.push(word.charAt(i));
        }
        if(!s.isEmpty()){
            ans = ans + s.size() + s.peek();
            while(!s.isEmpty()){
                s.pop();
            }
        }
        return ans;
    }
}