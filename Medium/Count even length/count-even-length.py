#User function Template for python3

import math
mod=10**9+7
class Solution:
	def compute_value(self, n):
		# Code here
		num=math.factorial(2*n)
		den=math.factorial(n)**2
		return(num//den)%mod
#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		n = int(input())
		ob = Solution()
		ans = ob.compute_value(n)
		print(ans)
# } Driver Code Ends