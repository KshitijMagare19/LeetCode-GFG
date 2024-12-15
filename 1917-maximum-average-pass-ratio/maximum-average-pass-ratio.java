class Solution {
    public double maxAverageRatio(int[][] cls, int extra) {
        // Gain calculation
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        for (int[] c : cls) {
            int p = c[0], t = c[1];
            pq.offer(new double[]{gain(p, t), p, t});
        }

        // Distribute extra students
        while (extra-- > 0) {
            double[] top = pq.poll();
            double g = top[0];
            int p = (int) top[1], t = (int) top[2];
            pq.offer(new double[]{gain(p + 1, t + 1), p + 1, t + 1});
        }

        // Compute the final average pass ratio
        double sum = 0;
        for (double[] c : pq) {
            sum += c[1] / c[2];
        }

        return sum / cls.length;
    }

    // Helper to calculate gain
    private double gain(int p, int t) {
        return (double) (p + 1) / (t + 1) - (double) p / t;
    }
}