class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] arr = new int[s.length()];
        char[] ch = s.toCharArray(), target = t.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(ch[i] - target[i]);
        }
        int cost = 0, start = 0, end = 0, ans = 0;

        while(start < arr.length && end < arr.length) {
            cost += arr[end++];
            if(cost <= maxCost) ans = Math.max(ans, end - start);
            else while(cost > maxCost) cost -= arr[start++];
        }
        return ans;
    }
}