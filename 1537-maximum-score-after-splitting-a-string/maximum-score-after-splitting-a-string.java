class Solution {
    public int maxScore(String s) {
        int ones = 0, zeros = 0, ans = 0; 
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '0')  zeros++; else ones++;
        }
        // System.out.println(ones + " : ones" + zeros+ " :zeros ==> ans: " + ans );
        if(zeros == 0) return ones - 1;
        if(ones == 0) return zeros - 1;
        int zero = 0;
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '0' && ones != 0)  zero++; else ones--;
            if(ones == 0) return Math.max(ans,zeros - 1);
            ans = Math.max(ans,zero+ones);
            // System.out.println(ones + " : ones" + zero+ " :zeros ==> ans: " + ans );
        }
        return ans;
    }
}