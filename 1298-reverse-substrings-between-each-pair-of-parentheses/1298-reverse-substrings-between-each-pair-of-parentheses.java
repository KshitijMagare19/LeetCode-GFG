class Solution {
    public String rev(String s){
        StringBuffer  str =new StringBuffer(s); 
        str = str.reverse();
         return str.toString();
    }

    public String reverseParentheses(String s) {
        StringBuffer  str =new StringBuffer(s); 
        String ans = "";
        int start = 0, end = 0; 
        int cnt = 0;
        for(int i = 0; i < s.length(); i++ ) if(s.charAt(i) == '(') cnt++;
        if (cnt == 0) return s;
        if(cnt < 2) {
            for(int i = 0; i < s.length(); i++ ){
                char c = s.charAt(i);
                if(c == '(') start = i;
                else if(c == ')') {
                    end = i;
                    break;
                }
            }
            int st = 0, ed = s.length(); 
            if(start != 0) st = start;
            if(end != s.length()) ed = end;
            ans  = s.substring(0,st) + rev(s.substring(st+1,end)) + s.substring(ed+1,s.length() );
            s = ans;
            return s;
        }
        else{
        while(cnt-- > 0){
            for(int i = 0; i < s.length(); i++ ){
                char c = s.charAt(i);
                if(c == '(') start = i;
                else if(c == ')') {
                    end = i;
                    break;
                }
            }
            
            ans  = s.substring(0,start) + rev(s.substring(start+1,end)) + s.substring(end + 1,s.length() );
            // System.out.println( s.substring(0,start)+ " - "+
            // s.substring(start+1,end) + " - "+ s.substring(end,s.length()) + " s: "+start+" e: "+end +"\n"+ ans);
            s = ans;
            // String str = str.substring(0,start) + 
            //str.substring(start,end).reverse() + str.substring(end);
        }
        }
        return s;
    }
}