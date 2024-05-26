class Solution {
    public boolean checkRecord(String s) {
        if(s.contains("LLL")) return false;
        int countOfA = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            if(c == 'A') countOfA++;
            if(countOfA == 2) return false;
        }
        return true;
    }
}