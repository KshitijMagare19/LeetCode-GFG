//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution {
  public:
    int solve(int H[], int N){
        // code here
        if(N==0) return 0;

        vector<int> ans;

        ans.push_back(H[0]);

        for(int i=1;i<N;i++){

            if(H[i]>ans.back()){

                ans.push_back(H[i]);

            }

            else{

                int ind= lower_bound(ans.begin(),ans.end(),H[i])-ans.begin();

                ans[ind]=H[i];

            }

        }

        return ans.size();

    }

    

    int Lis(int H[], int N){

        return solve(H,N);

    }

    int removeStudents(int H[], int N) {

        // code here

        int p=Lis(H,N);

        return N-p;

    }

    
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin>>N;
        
        int H[N];
        for(int i=0; i<N; i++)
            cin>>H[i];

        Solution ob;
        cout << ob.removeStudents(H,N) << endl;
    }
    return 0;
}
// } Driver Code Ends