#User function Template for python3
from itertools import groupby
class Solution():
    def lexicographicallyLargest(self, A, n):
        #your code here
        return [x for _, g in groupby(A, key=lambda k: k%2) for x in sorted(g, reverse=True)]


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == "__main__":
    for _ in range(int(input())):
        n = int(input())
        a = [int(i) for i in input().split()]
        ans = Solution().lexicographicallyLargest(a, n)
        for i in ans:
            print(i,end=" ")
        print()

# } Driver Code Ends