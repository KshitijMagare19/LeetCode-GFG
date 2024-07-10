class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        for(String folder : logs){
            if(folder.equals("./")){
                continue;
            }
            else if(folder.equals("../") && !st.isEmpty()){
                st.pop();
            }
            else if(!folder.equals("../") && !folder.equals("./")){ st.push(folder);}
        }
        System.out.println(st);
        return st.size();
    }
}