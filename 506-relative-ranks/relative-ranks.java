class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,String> map = new HashMap<>();
        int n = score.length;
         int b[] = score.clone(); 
        if(n == 1) return new String[] {"Gold Medal"};
        else if(n == 2)
        {
            if (score[0] > score[1] ) return new String[] {"Gold Medal","Silver Medal"};
            else return new String[] {"Silver Medal","Gold Medal"};
        }
        else{
            
            Arrays.sort(score);

            map.put(score[n-1],"Gold Medal");
            map.put(score[n-2],"Silver Medal"); 
            map.put(score[n-3],"Bronze Medal");  
            n = n-3;
            int rank = 4;
            while(n-- > 0){
                String srank = String.valueOf(rank);
                map.put(score[n],srank);  
                rank++;
            }
        }
        String[] ans = new String[score.length];
        for(int i = 0 ; i < b.length; i++){
            ans[i] = map.get(b[i]);
        }
        return ans;
    }
}