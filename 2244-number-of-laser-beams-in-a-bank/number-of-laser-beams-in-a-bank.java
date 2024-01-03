class Solution {
    public int ones(String s){
        int cnt = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '1') cnt++;
        }
        return cnt;
    }
    public int numberOfBeams(String[] bank) {
        int ans = 0, temp = 0,flag = 0;
        for(int i = 0; i < bank.length; i++){
            if(ones(bank[i]) > 0){
                if(flag == 0){
                    flag = 1;
                    //ans = ones(bank[i]);
                    temp = ones(bank[i]);
                }
                else{ 
                    flag++;
                    ans = ans + temp*ones(bank[i]);
                    temp = ones(bank[i]);
                }
            }
        }
        if(flag < 2) return 0;
        else return ans;
    }
}