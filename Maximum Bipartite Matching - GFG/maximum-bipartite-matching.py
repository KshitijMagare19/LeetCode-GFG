#User function Template for python3

class Solution:
	def maximumMatch(self, G):

        m, n = len(G), len(G[0])

        match = [-1] * n

        visited = [False] * n

        def dfs(i):

            for j in range(n):

                if G[i][j] and not visited[j]:

                    visited[j] = True

                    if match[j] == -1 or dfs(match[j]):

                        match[j] = i

                        return True

            return False

        count = 0

        for i in range(m):

            visited = [False] * n

            if dfs(i):

                count += 1

        return count


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		m, n = map(int, input().strip().split())
		G = []
		for i in range(m):
			G.append(list(map(int, input().strip().split())))
		obj = Solution()
		ans = obj.maximumMatch(G)
		print(ans)
# } Driver Code Ends