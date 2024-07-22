class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // HashMap<Integer,String> map = new HashMap<>();
        // for(int i = 0; i<names.length; i++){
        //     map.put(heights[i],names[i]);
        // }
        // String[] ans = new String[names.length];
        // Arrays.sort(heights);
        // int j = 0;
        // for(int i = heights.length -1 ; i>=0; i--){
        //     ans[j] = map.get(heights[i]);
        //     j++;
        // }
        // return ans;
        String[] ans = new String[names.length];
        TreeMap<Integer,String>  map = new TreeMap<>();
        for(int i = 0; i<names.length; i++){
            map.put(heights[i],names[i]);
        }
        int j = names.length - 1 ;
        System.out.println(map);
        for (Map.Entry<Integer,String> entry : map.entrySet()){

            ans[j--] = entry.getValue(); 
        } 

        return ans;
        
    }
}