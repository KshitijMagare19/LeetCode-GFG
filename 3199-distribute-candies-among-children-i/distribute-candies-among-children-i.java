class Solution {
    public int distributeCandies(int n, int limit) {
        return dynamicDestribution(n, 3, limit);
    }

    public int dynamicDestribution(int candies, int children, int limit) {

        if(children == 0) return candies == 0 ? 1 : 0;
        int count = 0;
        int range = Math.min(candies, limit) + 1;
        for(int i = 0; i < range; i++) count += dynamicDestribution(candies - i, children - 1, limit);
        
        return count;
    }
}