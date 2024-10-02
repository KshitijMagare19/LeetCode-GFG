class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int num : set) {
            map.put(num, rank++);
        }
        int[] ranks = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ranks[i] = map.get(arr[i]);
        }
        return ranks;
    }
}