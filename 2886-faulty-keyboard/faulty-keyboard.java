class Solution {
    public String finalString(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == 'i'){
                str = str.reverse();
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}