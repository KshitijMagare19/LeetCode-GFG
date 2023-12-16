class Solution {
    public boolean isAnagram(String s, String t) {
        char tempArray1[] = s.toCharArray();
        char tempArray2[] = t.toCharArray();
        Arrays.sort(tempArray1);
        Arrays.sort(tempArray2);
        String string1 = new String(tempArray1);
        String string2 = new String(tempArray2);
        return string1.equals(string2);
    }
}