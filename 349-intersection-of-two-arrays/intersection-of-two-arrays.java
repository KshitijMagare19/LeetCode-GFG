class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int i : nums1) arr1.add(i);
        for(int i : nums2) arr2.add(i);

        HashSet<Integer> ans = new HashSet<>();
        for(int i : arr1)if(arr2.contains(i)) ans.add(i);
        int j = 0;
        int[] result = new int[ans.size()];
        for(int i : ans) result[j++] = i;
        return result;
    }
}