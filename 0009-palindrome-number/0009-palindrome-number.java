class Solution {
    public boolean isPalindrome(int x) {
        boolean check = true;
        String s = Integer.toString(x);
        int size = s.length() - 1;
        int i = 0;
        while(i < (size + 1) / 2){
            if(s.charAt(i) != s.charAt(size - i)){
                check = false;
                break;
            }
            i++;
        }
        return check;
    }
}