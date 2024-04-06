class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(c!='(' && c!=')') ans.append(c);
            if(c == '(') {
                st.push(c);
                ans.append(c);
            }
            else if(c==')' && !st.isEmpty()){
                st.pop();
                ans.append(c);
            }
            
        }
        int j = ans.length()-1;
       
        while(!st.isEmpty()){
            if(ans.charAt(j) == '(' ) {
                ans.deleteCharAt(j);
                st.pop();
                //System.out.println(ans);
            }
            j--;
        }
        return ans.toString();
    }
}