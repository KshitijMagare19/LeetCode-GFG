class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        Arrays.sort(arr1);
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr1)map.put(i,map.getOrDefault(i,0)+1);
        int index = 0;
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < map.get(arr2[i]); j++){
                ans[index++] = arr2[i];
            }
            set.add(arr2[i]);
        }

        for(int i : arr1){
            if(!set.contains(i) ) ans[index++] = i;
        }
        return ans;
    }
}