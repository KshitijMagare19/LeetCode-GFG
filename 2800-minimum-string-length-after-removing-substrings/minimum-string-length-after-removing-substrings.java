class Solution {
    public int minLength(String s) {
        //int ans = 0;
        while(s.contains("AB") || s.contains("CD")){
            if(s.contains("AB")){
                //ans++;
                s = s.replace("AB","");
                // System.out.println(s);
            }
            else{
                //ans++;
                s = s.replace("CD","");
                // System.out.println(s);
            }
        }
        // System.out.println(s);
        return s.length();
    }
}