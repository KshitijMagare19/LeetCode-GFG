class Solution {
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
            int discount = findDiscountOfIndex(i, prices);
            prices[i] = prices[i] - discount;
        }

        return prices;
    }

    private static int findDiscountOfIndex(int i, int[] prices) {
        for (int j = i + 1; j < prices.length; j++) {
            if (prices[j] <= prices[i]) {
                return prices[j];
            }
        }
        return 0;
    }
}