class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(') st.push(c);
            else if(c == ')' && !st.empty()) st.pop();
            else if(c == ')' && st.empty()) ans++;
            
        }
        return st.size()+ans;
    }
}