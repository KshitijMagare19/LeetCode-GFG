class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            for(int j = arr[i].length() - 1; j >=0; j--){
                ans+=arr[i].charAt(j);
            }
            ans+=" ";
        }
        return ans.substring(0,s.length());
    }
}