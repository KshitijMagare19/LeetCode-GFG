class Solution {
    public int sumCounts(List<Integer> list) {
       int n=list.size();
        int ans=0;
        for(int i=0;i<n;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<n;j++){
                int a=list.get(j);
                set.add(a);
                int size=set.size();
                ans+=size*size;
            }
        }
        return ans; 
    }
}