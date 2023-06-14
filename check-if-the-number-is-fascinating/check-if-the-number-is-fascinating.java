class Solution {
    public boolean isFascinating(int n) {
        int n2 = n * 2;
        int n3 = n * 3;
        String s = String.valueOf(n);
        String s1 = String.valueOf(n2);
        String s2 = String.valueOf(n3);
        s+=s1;
        s+=s2;
        //System.out.println(s.length() + " "+ s);
        if(s.contains("1") &&
           s.contains("2") &&
           s.contains("3") &&
           s.contains("4") &&
           s.contains("5") &&
           s.contains("6") &&
           s.contains("7") &&
           s.contains("8") &&
           s.contains("9") && s.length() == 9) return true;
        else return false;
    }
}