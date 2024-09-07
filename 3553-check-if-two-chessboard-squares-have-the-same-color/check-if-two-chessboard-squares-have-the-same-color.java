class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int a = (int)coordinate1.charAt(0);
        int b = (int)coordinate1.charAt(1);
        int c = (int)coordinate2.charAt(0);
        int d = (int)coordinate2.charAt(1);

        return (a+b)%2 == (c+d)%2;

    }
}