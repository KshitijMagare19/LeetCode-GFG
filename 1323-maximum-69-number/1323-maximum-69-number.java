class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        String res = s.replaceFirst("6", "9");
        int ans = Integer.parseInt(res);  
        return ans;
    }
}