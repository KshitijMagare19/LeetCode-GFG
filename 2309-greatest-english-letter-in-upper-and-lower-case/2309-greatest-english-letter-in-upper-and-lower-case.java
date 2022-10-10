class Solution {
    public String greatestLetter(String s) {
        String ans = "";
        char tempArray[] = s.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        String sort = new String(tempArray);
        int index = 0;
        for(int i = 0; i < sort.length(); i++){
            if((int)sort.charAt(i) > 90){
                index = i - 1;
            } 
        }
        for(int i = index; i >= 0; i--){
            if(sort.contains(String.valueOf((char)((int)sort.charAt(i) + 32)))){
                ans += sort.charAt(i);
                return ans;
            } 
        }
        //System.out.println(sort);
        return "";
    }
}