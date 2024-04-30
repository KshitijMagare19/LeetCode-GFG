class Solution {
 
        public long wonderfulSubstrings(String word) {
    long cnt[] = new long[1024], res = 0;
    int mask = 0;
    cnt[0] = 1;
    for (var ch : word.toCharArray()) {
        mask ^= 1 << (ch - 'a');
        res += cnt[mask];
        for (var n = 0; n < 10; ++n)
            res += cnt[mask ^ (1 << n)];
        ++cnt[mask];
    }
    return res;
}
     
}