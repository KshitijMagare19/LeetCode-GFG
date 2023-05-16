class Solution {
    public int[] circularGameLosers(int n, int k) {
         boolean visited[] = new boolean[n];
        int v = 0, i=0;
        while(visited[i%n] == false){
            v++;
            visited[i%n] = true;
            i += v*k;
        }
        int[] res = new int[n-v];
        int j=0;
        for(i=0; i<visited.length; i++){
            if(visited[i] == false) res[j++]=i+1;
        }
        return res;
    }
}