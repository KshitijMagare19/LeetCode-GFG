...// } Driver Code Ends
//User function Template for Java
class Solution{
    static int longestSubstrDistinctChars(String s){
        // code here
        Set<Character> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int count = 0;
        int start = 0;
        while(start<s.length()) {
            //System.out.println("set : "+ set + " c : "+s.charAt(start)+ " start : "+ start + " max : "+ max);
            if(set.contains(s.charAt(start))) {
                set.clear();
                count++;
                start = count;
            }else {
                set.add(s.charAt(start));
                start++;
                max = Math.max(max, set.size());
            }
        }
        return max<0?s.length():max;
    }
}