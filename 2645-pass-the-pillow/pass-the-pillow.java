class Solution {
    public int passThePillow(int n, int time) {
         n--;
        
        int rem = time % n;
        int quo = time / n;
        
        // Left -> right only in one direction
        if( quo%2 != 0 ) return (n-rem)+1;
        
        // Left -> right then right -> left 
        return rem+1 ;
        
    }
}