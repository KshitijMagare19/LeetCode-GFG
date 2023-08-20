class Solution {
    public int minimumSum(int n, int k) {
        int sum = 0 ;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1; set.size() < n; i++){
            if(!set.contains(k-i)){
                sum+=i;
                set.add(i);
            }
        }
        //System.out.println(set);
        return sum;

        
    }
}