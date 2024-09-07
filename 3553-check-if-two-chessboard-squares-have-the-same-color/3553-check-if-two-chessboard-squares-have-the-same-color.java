class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        // int a = (int)coordinate1.charAt(0);
        // int b = (int)coordinate1.charAt(1);
        // int c = (int)coordinate2.charAt(0);
        // int d = (int)coordinate2.charAt(1);

        return ((int)coordinate1.charAt(0)+(int)coordinate1.charAt(1))%2 == ((int)coordinate2.charAt(0)+(int)coordinate2.charAt(1))%2;

    }
}