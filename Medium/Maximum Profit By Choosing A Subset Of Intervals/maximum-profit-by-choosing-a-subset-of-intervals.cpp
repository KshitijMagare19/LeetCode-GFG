//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++
class Solution {
  public:
  vector<vector<int>>job;
    int p=0;
    int solve(int i,vector<int>&dp,vector<int>&startTime){
        if(i>=job.size())return 0;
        if(dp[i]!=-1)return dp[i];
        int next=lower_bound(startTime.begin(),startTime.end(),job[i][1])-startTime.begin();
        return dp[i]=max(solve(i+1,dp,startTime),job[i][2]+solve(next,dp,startTime));
    }
    int jobSched(vector<int>& startTime, vector<int>& endTime, vector<int>& profit) {
        for(int i=0;i<startTime.size();i++){
            job.push_back({startTime[i],endTime[i],profit[i]});
        }
         sort(job.begin(),job.end());
        sort(startTime.begin(),startTime.end());
        vector<int>dp(job.size(),-1);
        return solve(0,dp,startTime);
    }
    int maximum_profit(int n, vector<vector<int>> &in) {
        // Write your code here.
        vector<int>s,e,p;
        for(int i=0;i<n;i++){
            s.push_back(in[i][0]);
           e.push_back(in[i][1]);
            p.push_back(in[i][2]);
        }
        return jobSched(s,e,p);
    }
};

//{ Driver Code Starts.

int main() {

    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<vector<int>> intervals(n, vector<int>(3));
        for (int i = 0; i < n; i++) {
            cin >> intervals[i][0] >> intervals[i][1] >> intervals[i][2];
        }
        Solution obj;
        cout << obj.maximum_profit(n, intervals) << endl;
    }
    return 0;
}

// } Driver Code Ends