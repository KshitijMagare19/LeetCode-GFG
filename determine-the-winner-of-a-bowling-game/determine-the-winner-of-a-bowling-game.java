class Solution {
    public int isWinner(int[] p1, int[] p2) {
        int s1 = 0, s2 = 0, cnt = 0;
        for(int i : p1){
            if(i == 10 && cnt < 1){
                cnt = 2;
                s1+= i;
            }
            else if(i == 10 && cnt < 1){
                cnt = 2;
                s1+= i;
            }
            else if(i == 10 && cnt > 0){
                cnt = 2;
                s1+= i*2;
            }
            else if(cnt > 0){
                s1+=(2*i);
                cnt--;
            }
            else{
                s1+=i;
            }  
        } 
        cnt = 0;
        for(int i : p2){
            if(i == 10 && cnt < 1){
                cnt = 2;
                s2+= i;
            }
            else if(i == 10 && cnt < 1){
                cnt = 2;
                s2+= i;
            }
            else if(i == 10 && cnt > 0){
                cnt = 2;
                s2+= i*2;
            }
            else if(cnt > 0){
                s2+=(2*i);
                cnt--;
            }
            else{
                s2+=i;
            }
        }
        System.out.println(s1 + " "+ s2);
        if(s1>s2) return 1;
        else if(s1 == s2) return 0;
        else return 2;
    }
}