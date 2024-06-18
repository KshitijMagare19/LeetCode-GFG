class Solution {
        public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(0, 0);
        for (int i = 0; i < difficulty.length; i++) {
            map.put(difficulty[i], Math.max(profit[i], map.getOrDefault(difficulty[i], 0)));
        }
        int best = 0, res = 0;
        for (Integer key : map.keySet()) {
            best = Math.max(map.get(key), best);
            map.put(key, best);
        }
        for (int i = 0; i < worker.length; i++) {
            res += map.get(map.floorKey(worker[i]));//.getValue();
        }
        return res;
    }
}