class Solution {
    public char findTheDifference(String s, String t) {
        int op = 0;
        for(char st : s.toCharArray()){
            op = op ^ st;
        }
        for(char tt : t.toCharArray()){
            op = op ^ tt;
        }
        return (char)op;
    }
}