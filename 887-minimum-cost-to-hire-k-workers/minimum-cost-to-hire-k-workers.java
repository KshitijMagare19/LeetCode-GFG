class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        double res = Double.MAX_VALUE;

        double[][] worker_ratio = new double[n][2];
        for (int worker = 0; worker < n; worker++) {
            worker_ratio[worker][0] = (double) wage[worker] / quality[worker];
            worker_ratio[worker][1] = quality[worker];
        }
        Arrays.sort(worker_ratio, (a, b) -> Double.compare(a[0], b[0]));
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());

        double sum_quality = 0;
        for (int i = 0; i < k; i++) {
            pq.offer(worker_ratio[i][1]); // Push k qualities in max-heap
            sum_quality += worker_ratio[i][1]; // Find sum of qualities
        }
        double manager_ratio = worker_ratio[k-1][0];
        res = manager_ratio * sum_quality;

        for(int i = k; i<n; i++){
            manager_ratio = worker_ratio[i][0];
            sum_quality += worker_ratio[i][1];

            pq.add(worker_ratio[i][1]);

            if(pq.size() > k){
                sum_quality -= pq.poll();
            }

            res = Math.min(res , manager_ratio*sum_quality);
        }

        return res;

    }
}