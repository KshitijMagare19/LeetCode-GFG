//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
	public:

		    // Code here
		const int mod = 1e9 + 7 ;
	int dp[10001] ; 
	int dfs(string &s ,int i ){
	    int n = s.size() ; 
	    if(i >= n ) return 1 ; 
	    if(dp[i] != -1 ) return dp[i] ; 
	    int a = s[i] -'0'  ; 
	    if(a == 0 ) return 0 ; 
	    int ans = 0 ; 
	    if(i + 1 < n ) {
	        int b = s[i+1] - '0' ; 
	        int f= a*10 + b ; 
	        if(f <= 26 )
	            ans = (ans + dfs(s , i+2 ) )%mod  ; 
	    }
	    ans = (ans +  dfs(s , i +1))%mod ; 
	    return dp[i] = ans ; 
	}
	
		int CountWays(string str){
		    // Code here
		    memset(dp , -1 , sizeof(dp)  ) ; 
		    return dfs(str , 0 ) ;
		}

};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		string str;
		cin >> str;
		Solution obj;
		int ans = obj.CountWays(str);
		cout << ans << "\n";
	}
	return 0;
}
// } Driver Code Ends