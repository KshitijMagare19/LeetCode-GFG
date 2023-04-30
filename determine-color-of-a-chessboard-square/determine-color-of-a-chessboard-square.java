class Solution {
    public boolean squareIsWhite(String coordinates) {
        TreeMap<String,Boolean> map = new TreeMap<>();
        char a = 'a';
        char n = '1';
        for(int i = 0; i < 8; i+=2){
            for(int j = 0; j < 8; j++){
                String s = "";
                s += a;
                s+= n;
                n++;
                if(j%2 == 0) map.put(s,false);
                else map.put(s,true);
            }
            a+=2;
            n = '1';
        }
        a = 'b';
        for(int i = 1; i < 8; i+=2){
            for(int j = 0; j < 8; j++){
                String s = "";
                s += a;
                s+= n;
                n++;
                if(j%2 == 0) map.put(s,true);
                else map.put(s,false);
            }
            a+=2;
            n = '1';
        }
        //System.out.println(map);
        return map.get(coordinates);
    }
}