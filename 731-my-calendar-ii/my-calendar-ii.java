class MyCalendarTwo {
    private TreeMap<Integer, Integer> pointFreq = null;
    public MyCalendarTwo() {
          pointFreq = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        pointFreq.put(start, pointFreq.getOrDefault(start, 0) + 1);
        pointFreq.put(end, pointFreq.getOrDefault(end, 0) - 1);
        if(causingTripleBooking(start, end))return false;
        return true;
    }
    private boolean causingTripleBooking(int start, int end){
        int overlapCnt = 0;
        for(var entry : pointFreq.entrySet()){
            overlapCnt += entry.getValue();
            if(overlapCnt > 2){
                pointFreq.put(start, pointFreq.getOrDefault(start, 0) - 1);
                pointFreq.put(end, pointFreq.getOrDefault(end, 0) + 1);
                return true;
            }
        }
        return false;
    }
}