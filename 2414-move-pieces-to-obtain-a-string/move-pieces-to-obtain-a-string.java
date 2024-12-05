class Solution {
    public boolean canChange(String start, String target) {
         int i = 0, j = 0, n = start.length();
        
        while (i < n || j < n) {
            while (i < n && start.charAt(i) == '_')
                i++;
            while (j < n && target.charAt(j) == '_')
                j++;
            
            if (i == n || j == n)
                break;
            if (start.charAt(i) != target.charAt(j))
                return false;
            if (start.charAt(i) == 'L' && i < j)
                return false;
            if (start.charAt(i) == 'R' && i > j)
                return false;
            
            i++;
            j++;
        }
        
        return i == n && j == n;
    }
}