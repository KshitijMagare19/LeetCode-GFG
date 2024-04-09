class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ans = 0, i = 0;
        while(tickets[k] != 0){
            if(tickets[i] > 0){
                tickets[i] = tickets[i] - 1;
                ans++;            
            }
        
            if(i++ == tickets.length - 1) i = 0;
        }
        return ans;
    }
}