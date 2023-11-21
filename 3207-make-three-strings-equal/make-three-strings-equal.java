class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int n1 = s1.length(), n2 = s2.length(), n3 = s3.length(); 
        int len = Math.min(n1,n2);
        len = Math.min(len,n3);
        int common = 0;
        for(int i = 0; i < len; i++){
            if(s1.charAt(0) !=  s2.charAt(0) || s1.charAt(0) !=  s3.charAt(0)){
                return -1;
            }
            else if(s1.charAt(i) ==  s2.charAt(i) && s1.charAt(i) ==  s3.charAt(i)){
                common++;
            }
            else break;
        }
        int ans = (n1-common)+(n2-common)+(n3-common);
        return ans;

    }
}