class Solution {
    public int leastInterval(char[] tasks, int n) {
        int count = 0, ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : tasks){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        /// System.out.println(map);
        PriorityQueue<Integer> pq = new PriorityQueue<>(map.size(),Collections.reverseOrder());
        
        pq.addAll(map.values());
        while(!pq.isEmpty()){
            count = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < n+1; i++){
                
                if(!pq.isEmpty()){
                    list.add(pq.remove()-1);
                    count++;
                }
            }
            ///System.out.println(pq);
            for(int i : list){
               if(i > 0) pq.add(i);
            }
            ans +=(pq.isEmpty()) ?count : n+1;
             //System.out.println(list);
        }
        return ans;
    }
}