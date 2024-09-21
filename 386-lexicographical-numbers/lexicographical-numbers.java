class Solution {
    public List<Integer> lexicalOrder(int n) {
        String[] arr = new String[n];
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            arr[i-1] = String.valueOf(i);
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            ans.add(Integer.valueOf(arr[i]));
        }
        return ans;
    }
}