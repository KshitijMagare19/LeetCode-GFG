class Solution {
    public double averageWaitingTime(int[][] customers) {
        double ans = 0;
        double size = customers.length;
        int waitingTime = 0, finishingTime = 0, arrivalTime = -1;
        for(int i = 0 ; i < customers.length; i++){
            arrivalTime = Math.max(customers[i][0], finishingTime);
            finishingTime = arrivalTime + customers[i][1];
            waitingTime = finishingTime - customers[i][0] ;
            // System.out.println(" WT: " + waitingTime + "AT "+ arrivalTime 
            // + "UT "+ finishingTime);
            ans += waitingTime;
        }
        return ans/size ;
    }
}