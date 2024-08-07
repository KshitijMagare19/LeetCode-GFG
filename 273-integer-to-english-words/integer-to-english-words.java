class Solution {
    public String numberToWords(int num) {
    if (num == 0) return "Zero";
    String[] big= {"", "Thousand", "Million", "Billion"};
    String[] small = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    StringBuilder res = new StringBuilder();
    int count = 0;
    while (num != 0) {
        int cur = num % 1000;
        int o = cur % 10, t = (cur / 10) % 10, h = cur / 100;
        StringBuilder tmp = new StringBuilder();
        if (h != 0) tmp.append(ones[h] + " Hundred ");
        if (t == 1) tmp.append(small[o] + " ");
        else {
            if (t > 1) tmp.append(tens[t-2] + " ");
            if (o > 0) tmp.append(ones[o] + " ");
        }
        if(tmp.length() != 0) tmp.append(big[count] + " ");
        res.insert(0, tmp);
        num /= 1000;
        count++;
    }
    return res.toString().trim();
}
}