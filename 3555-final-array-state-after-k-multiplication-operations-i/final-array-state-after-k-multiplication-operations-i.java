class Solution {

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i : nums) list.add(i);

        while(k-->0){
            list.set(list.indexOf( Collections.min(list)),Collections.min(list)*multiplier);
        }
        
        return list.stream().mapToInt(i -> i).toArray();

    }
}