class Solution {
    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        for(int i=0; i < Math.max(ver1.length, ver2.length); i++){
            int v1 = (i < ver1.length) ? Integer.valueOf(ver1[i]) : 0;
            int v2 = (i < ver2.length) ? Integer.valueOf(ver2[i]) : 0;
            if(v1 < v2) return -1;
            if(v1 > v2) return 1;
        }
        return 0;
    }
}