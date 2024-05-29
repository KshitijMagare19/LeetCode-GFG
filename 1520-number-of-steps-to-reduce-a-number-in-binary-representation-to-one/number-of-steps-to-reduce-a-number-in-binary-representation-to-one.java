public class Solution {
    private void addOne(StringBuilder s, int i) {
        if (i == -1) {
            s.insert(0, '1');
            return;
        }
        if (s.charAt(i) == '0') {
            s.setCharAt(i, '1');
        } else {
            s.setCharAt(i, '0');
            addOne(s, i - 1);
        }
    }

    public int numSteps(String s) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        while (sb.length() != 1) {
            if (sb.charAt(sb.length() - 1) == '1') {
                addOne(sb, sb.length() - 1);
            } else {
                sb.setLength(sb.length() - 1);  // Remove last character
            }
            count++;
        }
        return count;
    }
}