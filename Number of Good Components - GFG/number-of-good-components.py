#User function Template for python3

import collections
from collections import deque
from collections import defaultdict

class Solution:
    def dfs(self, graph, visited, u):
        res = [u]
        visited[u] = True
        for v in graph[u]:
            if not visited[v]:
                res.extend(self.dfs(graph, visited, v))
        return res
    def findNumberOfGoodComponent(self, V, adj):
        visited = [False]*(V+1)
        res = 0
        for u in range(1, V+1):
            if not visited[u]:
                nodes = self.dfs(adj, visited, u)
                if all(len(adj[node]) == len(nodes)-1 for node in nodes):
                    res += 1
        return res


#{ 
 # Driver Code Starts
#Initial Template for Python 3

from sys import stdin, stdout
if __name__ == '__main__':
    test_cases = int(input())
    for _ in range (test_cases):
        E, V = map(int, input().split())
        adj = [[] for _ in range(V+1)]
        for _ in range(E):
            a,b = map(int, input().split())
            adj[a].append(b)
            adj[b].append(a)
            
        res = Solution().findNumberOfGoodComponent(V, adj)
        print(res)
# } Driver Code Ends