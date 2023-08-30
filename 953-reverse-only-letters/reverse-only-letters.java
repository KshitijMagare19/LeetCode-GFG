class Solution {
    public String reverseOnlyLetters(String s) {
        String str = "";
        String rev = "";
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(( c >= 'a' && c <='z') || ( c >= 'A' && c <='Z')){
                str+=c;
            }
        }
        System.out.println(str.length() - 1+"str : " + str);
        int k = str.length() - 1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //System.out.println(c);
            //System.out.println(( c < 'A') ||(c>'Z' && c < 'a') );
            if(( c < 'A') ||(c>'Z' && c < 'a')){
                ans+=c;
                //System.out.println("C : " + c);
            }
            else{
                ans+=str.charAt(k--);
            }
        }
        return ans;
    }
}