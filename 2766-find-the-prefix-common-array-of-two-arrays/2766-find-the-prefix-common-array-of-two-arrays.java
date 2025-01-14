class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int n = a.length, cnt = 0;
        int[] ans = new int[n];
        ans[0] = 0;
        if(n == 1){
            if(a[0] == b[0]) {
                ans[0] = 1;
                return ans;
            }
            return ans;
        }  
        // set1.add(a[0]);
        // set2.add(b[0]);
        for(int i = 0 ; i < n; i++){
            // System.out.println(a[i] + " "+ b[i] + " "+ cnt);
            if(a[i] != b[i]){
                if(set1.contains(b[i])) cnt++;
                if(set2.contains(a[i])) cnt++;
                set1.add(a[i]);
                set2.add(b[i]);
            }
            if(a[i] == b[i]){
                cnt++;
                set1.add(a[i]);
                set2.add(b[i]);
            }
            ans[i]=cnt;
        }
        return ans;
    }
}