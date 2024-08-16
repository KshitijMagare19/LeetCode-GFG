class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int res = Integer.MIN_VALUE;

        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int min = arrays.get(0).get(0);
        for (int i = 1; i < arrays.size(); i++) {
            res = Math.max(res, Math.abs(arrays.get(i).get(0) - max));
            res = Math.max(res,
                    Math.abs(arrays.get(i).get(arrays.get(i).size() - 1) - min));

            max = Math.max(max, arrays.get(i).get(arrays.get(i).size() - 1));
            min = Math.min(min, arrays.get(i).get(0));
        }
        return res;
    }
}