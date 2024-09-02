class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i = 0, n = chalk.length;
       // System.out.println("k : "+ k+ " chalk[i]:"+ chalk[i] + " i:"+ i);
        while(k >= chalk[i]){
            k -=chalk[i];
            i++;
            if(i >= n) i = 0;
            //System.out.println("k : "+ k+ " chalk[i]:"+ chalk[i] + " i:"+ i);
        }
        return i;

    }
}