class Solution {
        ArrayList arr=new ArrayList();
        public boolean isHappy(int n) {
            if(arr.contains(n)){
                return false;
            }
            if(n==1){
                return true;
            }
            int sum=0;
            arr.add(n);
            while(n!=0) {
                int m = n % 10;
                sum +=m * m;
                n = n/10;
            }
            return isHappy(sum);
    }
}
