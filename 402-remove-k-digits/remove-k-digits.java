class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < num.length(); i++){
            char c = num.charAt(i);
            
            while(!st.empty() && k > 0 && c < st.peek() ){
                st.pop();
                k--;
            }
            if(!st.empty() || c != '0'){
                st.push(c);
            }
        }
         while(!st.empty() && k-->0 ){
             st.pop();
         }
         if(st.empty()) return "0";

        int n = st.size();
        char[] arr = new char[n];

         while(!st.empty()){
            arr[--n] = st.pop();
         }
         String ans = "";
         for(char c : arr) ans+= c;
         return ans;

    }
}