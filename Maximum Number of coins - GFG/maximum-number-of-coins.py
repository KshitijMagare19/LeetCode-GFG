#User function Template for python3

class Solution():
    def maxCoins(self, N, a):
        #your code goes here
        MAX_N = N + 2
        dp = [[0] * MAX_N for _ in range(MAX_N)]
        a.insert(0, 1)
        a.append(1)
        for length in range(0, N - 1 + 1):
            for start in range(1, N - length + 1):
                end = start + length
                max_profit = 0
                for i in range(start, end + 1):
                    profit = (
                        dp[start][i - 1]
                        + a[start - 1] * a[i] * a[end + 1]
                        + dp[i + 1][end]
                    )
                    max_profit = max(max_profit, profit)
                dp[start][end] = max_profit
        return dp[1][N]

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == "__main__":
    for _ in range(int(input())):
        n = int(input())
        a = [int(i) for i in input().split()]
        print(Solution().maxCoins(n, a))
# } Driver Code Ends