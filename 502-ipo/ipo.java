class Solution {
    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        int maxCapital = 0;
        for (int i = 0; i < Capital.length; i++) {
            maxCapital = Math.max(Capital[i], maxCapital);
        }

        if (W >= maxCapital) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
                @Override
                public int compare(Integer a, Integer b) {
                    return a - b;
                }
            });
            for (int p : Profits) {
                maxHeap.add(p);
                if (maxHeap.size() > k) maxHeap.poll();
            }
            for (int h : maxHeap) W += h;
            return W;
        }

        int index;
        int n = Profits.length;
        for (int i = 0; i < Math.min(k, n); i++) {
            index = -1;
            for (int j = 0; j < n; ++j) {
                if (W >= Capital[j] && (index == -1 || Profits[index] < Profits[j])) {
                    index = j;
                }
            }
            if (index == -1) break;
            W += Profits[index];
            Capital[index] = Integer.MAX_VALUE;
        }
        return W;
    }
}