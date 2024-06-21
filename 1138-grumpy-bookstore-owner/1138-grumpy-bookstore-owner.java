class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int ans = 0, total = 0;
        for (int i = 0; i < customers.length; i++) {
            total += (1 - grumpy[i]) * customers[i];
        }

        int windowAll = 0, windowPartial = 0;
        for (int i = 0; i < customers.length; i++) {
            windowAll += customers[i];
            windowPartial += ((1 - grumpy[i]) * customers[i]);
            if (i + 1 >= minutes) {
                ans = Math.max(ans, total - windowPartial + windowAll);
                int left = i - minutes + 1;
                windowAll -= customers[left];
                windowPartial -= ((1 - grumpy[left]) * customers[left]);
            }
        }
        return ans;
    }
}