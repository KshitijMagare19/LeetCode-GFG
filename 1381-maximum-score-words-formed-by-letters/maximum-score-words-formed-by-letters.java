class Solution {
    int max=0;
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        dfs(words,letters,score,0,new ArrayList<String>());
        return max;
    }
    public void dfs(String[] words, char[] letters, int[] score, int i, ArrayList<String> arr){
        if(i==words.length){
            HashMap<Character,Integer> h=new HashMap<Character,Integer>();
            for(int j=0;j<letters.length;j++){
                if(h.containsKey(letters[j]))
                h.put(letters[j],h.get(letters[j])+1);
                else
                h.put(letters[j],1);
            }
            int curr=0;
            first: for(int j=0;j<arr.size();j++){
                HashMap<Character,Integer> temp=new HashMap<Character,Integer>(h);
                int c=0;
                for(int k=0;k<arr.get(j).length();k++){
                    if(!temp.containsKey(arr.get(j).charAt(k)))
                    continue first;
                    if(temp.get(arr.get(j).charAt(k))==0)
                    continue first;
                    else{
                        temp.put(arr.get(j).charAt(k),temp.get(arr.get(j).charAt(k))-1);
                        c+=score[arr.get(j).charAt(k)-'a'];
                    }
                }
                curr+=c;
                h=temp;
            }
            max=Math.max(max,curr);
            return;
        }
        dfs(words,letters,score,i+1,arr);
        arr.add(words[i]);
        dfs(words,letters,score,i+1,arr);
        arr.remove(arr.size()-1);
    }
}