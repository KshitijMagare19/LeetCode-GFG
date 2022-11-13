class Solution {
    public String reverseWords(String s) {
        String k = s.replaceAll("\\s+", " ").trim();
        //System.out.println(k);
        String[] arr = k.split(" ");
        int len = arr.length;
        int j = 1;
        String ans = "";
        for(int i = len -1; i >= 0; i--){
            ans+=arr[i];
            if(j++ < len){
                ans+=" ";
            }
        }
        return ans;
    }
}