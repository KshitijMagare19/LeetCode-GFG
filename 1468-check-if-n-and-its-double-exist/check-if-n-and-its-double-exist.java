class Solution {
    public boolean checkIfExist(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : arr){
            al.add(i);
        }
        for(int i : arr){
            if(al.contains(i*2) && i!=(2*i)) return true;
            if(al.indexOf(0) != al.lastIndexOf(0)) return true;
        }

        return false;
    }
}