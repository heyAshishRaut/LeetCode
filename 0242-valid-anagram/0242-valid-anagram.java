class Solution {
    public boolean isAnagram(String s, String t) {
        boolean check = false;

        char []A = s.toCharArray();
        char []B = t.toCharArray();

        Arrays.sort(A);
        Arrays.sort(B);

        String fromA = Arrays.toString(A);
        String fromB = Arrays.toString(B);

        if(fromA.equals(fromB)){
            check = true;
        }
        return check;
    }
}