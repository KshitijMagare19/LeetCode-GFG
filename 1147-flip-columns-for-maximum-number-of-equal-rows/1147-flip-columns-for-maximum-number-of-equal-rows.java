class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> freqMap = new HashMap<>();
        int maxEqualRows = 0;
        for(int[] row : matrix) {
            // xor string using its first bit to avoid storing flliped version
            String binaryString = arrayToXorString(row, row[0]);

            int currentRowColumn = freqMap.getOrDefault(binaryString, 0) + 1;
            freqMap.put(binaryString, currentRowColumn);

            // updating max count after processing each row
            maxEqualRows = Math.max(maxEqualRows, currentRowColumn);
        }
        return maxEqualRows;
    }

    // helper method to conver array to Srring
    private String arrayToXorString(int[] arr, int xor) {
        StringBuilder sb = new StringBuilder();
        for(int i : arr) {
            sb.append(i ^ xor);
        }
        return sb.toString();
    }
}

//Time O(n*m)
//Space O(n*m)