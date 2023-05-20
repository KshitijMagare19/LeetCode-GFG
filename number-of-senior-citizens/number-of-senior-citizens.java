class Solution {
    public int countSeniors(String[] details) {
        String age = "";
        int ans = 0;
        for(int i = 0; i < details.length; i++){
            age+=details[i].charAt(11);
            age+=details[i].charAt(12);
            int old = Integer.valueOf(age); 
            if(old > 60) ans++;
            age = "";
        }
        return ans;
    }
}