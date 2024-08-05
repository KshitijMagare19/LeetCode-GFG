class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s: arr) map.put(s,map.getOrDefault(s,0)+1);
        String[] ans = new String[arr.length];
        Arrays.fill(ans, "");
        int index = 0;
        for(String s: arr){
            if(map.get(s) == 1) ans[index++] = s;
        }
        return ans[--k];
    }
}