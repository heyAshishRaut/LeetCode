class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i);

            if(hm.containsKey(sCh)) {
                if (hm.get(sCh) != tCh) {
                    return false;
                }
            }
            else if(hm.containsValue(tCh)){
                return false;
            }
            else{
                hm.put(sCh, tCh);
            }
        }
        return true;
    }
}