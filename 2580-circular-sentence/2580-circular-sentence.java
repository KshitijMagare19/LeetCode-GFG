class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");
        if(arr.length == 1){
            if(sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) return false;
            else return true;
        }
        else{
            for(int i = 0; i < arr.length - 1; i++){
                int len = arr[i].length();
                char c = arr[i].charAt(len-1);
                char d = arr[i+1].charAt(0);
                if(c != d) return false;
            }

            if(arr[0].charAt(0)!=arr[arr.length - 1].charAt(arr[arr.length - 1].length() - 1)) return false;
        }
        return true;
    }
}