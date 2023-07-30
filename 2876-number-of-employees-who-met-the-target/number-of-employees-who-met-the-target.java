class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int cnt = 0;
        for(int i : hours){
            if(i >= target) cnt++;
        }
        return cnt;
    }
}