class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<> ();
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            else{
                if(st.empty()){
                    return false;
                }
                else{
                    char parentheses = st.peek();
                    if(s.charAt(i) == ')' && parentheses == '(' || 
                       s.charAt(i) == '}' && parentheses == '{' ||
                       s.charAt(i) == ']' && parentheses == '['){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return st.empty();
    }
}