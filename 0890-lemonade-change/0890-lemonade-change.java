class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] map = new int[3]; // count for 5,10,20 in this order
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                map[0]++;
            } else if (bills[i] == 10) {
                map[1]++;
                if (map[0] < 1) 
                    return false;
                map[0]--;
            } else {
                map[2]++;
                if (map[0] > 0 && map[1] > 0) {
                    map[0]--;
                    map[1]--;
                } else if (map[0] >= 3) {
                    map[0] -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}