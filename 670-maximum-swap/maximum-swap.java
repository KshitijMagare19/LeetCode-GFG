class Solution {
    public int maximumSwap(int num) {
        String[] arr = String.valueOf(num).split("");
        String[] sorted = String.valueOf(num).split("");
        Arrays.sort(sorted);
        HashMap<Character,Integer> map = new HashMap<>();
        String s1 = String.valueOf(num);
        for (int i = 0; i < s1.length(); i++)
            map.put(s1.charAt(i),i);

        //System.out.println(map);
        int n = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (Integer.valueOf(arr[i]) < Integer.valueOf(sorted[n])) {
                String s = arr[i];
                arr[i] = sorted[n];
                int index = map.get(sorted[n].charAt(0));
            //System.out.println(Integer.valueOf(arr[i]) +" : "+ Integer.valueOf(sorted[n]) + ""+ index+ "" + );
                arr[index] = s;
                break;
            }
            else{
                n--;
            }
        }
        String s2 = "";
        for (String s : arr)
            s2 += s;
        return Integer.valueOf(s2);
    }
}