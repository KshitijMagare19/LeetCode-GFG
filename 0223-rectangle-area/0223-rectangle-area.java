class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2-ax1)*(ay2-ay1);
        int area2 = (bx2-bx1)*(by2-by1);
        
        int overlap=0;
        int left = Math.max(ax1,bx1);
        int right = Math.min(ax2,bx2);
        int x = right-left;
        
        int bottom = Math.max(ay1,by1);
        int top = Math.min(ay2,by2);
        int y = top-bottom;
        
        if(x>0 && y>0) overlap = x*y;
        
        return area1+area2-overlap;
    }
}