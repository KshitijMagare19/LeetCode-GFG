class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> cnt = new TreeMap<>();
        for (int[] it : items1) {
            cnt.merge(it[0], it[1], Integer::sum);
        }
        for (int[] it : items2) {
            cnt.merge(it[0], it[1], Integer::sum);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (var e : cnt.entrySet()) {
            ans.add(Arrays.asList(e.getKey(), e.getValue()));
        }
        return ans;
    }
}