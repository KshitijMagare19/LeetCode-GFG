//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution {

  public:
    int noConseBits(int n) {
        // code here
        int ans=0;
        int i=31;
        int count=0;
        while(i>=0)
        {
            if(count<=1 && (n&(1<<i)))
            {
                ans=(ans|(1<<i));
                count++;
            }
            else
            {
                count=0;
            }
            i--;
        }
        return ans;
    }
};


//{ Driver Code Starts.

int main() {

    int tt;
    cin >> tt;
    Solution sol;
    while (tt--) {

        int n;
        cin >> n;
        int ans = sol.noConseBits(n);
        cout << ans << '\n';
    }

    return 0;
}

// } Driver Code Ends