class Solution {
    public int tupleSameProduct(int[] nums) {
		
		Map<Integer, Integer> prodCount = new HashMap<>();
		int n = nums.length;
		// count the product of every number with every other number
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] != nums[j]) {
					int prod = nums[i] * nums[j];
					prodCount.put(prod, prodCount.getOrDefault(prod, 0) + 1);
				}
			}
		}
		int count = 0;
		for (Integer prod : prodCount.keySet()) {
			if (prodCount.get(prod) > 1) {
				int v = prodCount.get(prod);
				
				// here we use combinatorial nC2 (choose two out of n)
				count += (v) * (v - 1) / 2;
			}
		}
		// for every tuple we can rearrange the numbers to get 8 in total tuples
		return count * 8;
	}
}