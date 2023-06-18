class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        if (mainTank < 5) return mainTank * 10;
        int distance = mainTank * 10 ;
        while (mainTank - 5 >= 0 && additionalTank > 0) {
            mainTank -= 4;
            additionalTank--;
            distance += 10;
        }
        return distance;
    }
}