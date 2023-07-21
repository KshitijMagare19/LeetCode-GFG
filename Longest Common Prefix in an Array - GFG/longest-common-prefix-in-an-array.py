#User function Template for python3

class Solution:
    def longestCommonPrefix(self, arr, n):
        pref = ""
        idx = arr.index(min(arr, key=len));
        minStr = arr[idx];
        del arr[idx]
        for i in range(len(minStr)):
            ch = minStr[i]
            for j in range(len(arr)):
                if arr[j][i] != ch:
                    pref = -1 if pref == "" else pref
                    return pref
            pref += ch    
        return pref


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        n = int(input())
        arr = [x for x in input().strip().split(" ")]
        
        ob=Solution()
        print(ob.longestCommonPrefix(arr, n))
# } Driver Code Ends