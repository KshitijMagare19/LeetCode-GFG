class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n=s.length();
        int m=spaces.length;
        char[] chrs=new char[n+m];

        int j=0;
        for(int i=0; i<n; i++){
            if(j<m && i+j==spaces[j]+j){
                chrs[i+j]=' ';
                j++;
            }
            chrs[i+j]=s.charAt(i);
        }

        return new String(chrs);
    }
}