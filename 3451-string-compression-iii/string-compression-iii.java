class Solution {
    public String compressedString(String word) {
        if (word.length() == 1)
            return 1 + word;
        char c1 = word.charAt(0);
        int feq = 1;
        String ans = "";
        char c = '1';
        for (int i = 1; i < word.length(); i++) {
            c = word.charAt(i);
            if (c1 != c) {
                while (feq > 9) {
                    ans = ans + '9' + c1;
                    feq = feq - 9;
                }
                ans = ans + feq + c1;
                feq = 1;
                c1 = c;
            } else {
                feq++;
            }

        }
        while (feq > 9) {
            ans = ans + '9' + c;
            feq = feq - 9;
        }
        ans = ans + feq + c;

        return ans;

    }
}