class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int ans = 0;
        final int mod = (int) 1e9 + 7;
        //TreeSet<Integer> set = new TreeSet<>();
        ArrayList<Integer> list = new ArrayList<>();  
        for(int i = 0 ; i < n; i++){
            int temp = 0;
            for(int j = i; j < n ; j++){
                temp+=nums[j];
                list.add(temp);
            }
        }
        Collections.sort(list);
        int arr[] = new int[list.size()];     
        int index = 0;  
        for (int ele : list)  
            arr[index++] = ele;
        for(int i = left-1; i < right ; i++){
            ans = (ans + arr[i]) % mod;
        }
        //System.out.println(Arrays.toString(arr)); 
        return ans;
        // Iterator itr = set.iterator();
        // int index = 0;

        // while (itr.hasNext()){
        //     if(index >= left && index <= right) ans = ans  + itr.next();
        //     index++;
        // }
    }
}