class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> map1 = new HashSet<>();
        Set<Integer> map2 = new HashSet<>();
        List<Integer> arrl1 = new ArrayList<>();
        List<Integer> arrl2 = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        for(int i : nums1){
            if(!(map1.contains(i))) map1.add(i);
        }
        for(int i : nums2){
            if(!map2.contains(i)) map2.add(i);
        }

        for(int i : map1){
            if(!map2.contains(i)) arrl1.add(i);
        }
        for(int i : map2){
            if(!map1.contains(i)) arrl2.add(i);
        }
        ans.add(arrl1);
        ans.add(arrl2);
        return ans;

    }
}