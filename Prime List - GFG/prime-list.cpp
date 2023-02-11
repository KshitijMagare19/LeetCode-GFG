//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

class Node{
public:
    int val;
    Node *next;
    Node(int num){
        val=num;
        next=NULL;
    }
};


// } Driver Code Ends
//User function Template for C++

/*

class Node{
public:
    int val;
    Node *next;
    Node(int num){
        val=num;
        next=NULL;
    }
};

*/

class Solution{
public:
    bool prime(int n){
        int s=sqrt(n);
        for(int i=2;i<=s;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    Node *primeList(Node *head){
        Node*cur=head;
        while(cur){
            if(cur->val==1){
                cur->val=2;
                cur=cur->next;
                continue;
            }
            bool t=prime(cur->val);
            if(t==true){
                cur=cur->next;
                continue;
            }
            for(int j=(cur->val)-1;j>=2;j--){
                t=prime(j);
                if(t==true){
                    cur->val=j;
                    cur=cur->next;
                    break;
                }
                t=prime(2*(cur->val)-j);
                if(t==true){
                    cur->val=2*(cur->val)-j;
                    cur=cur->next;
                    break;
                }
            }
        }
        return head;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        Node *head,*tail;
        int num;
        cin>>num;
        head=tail=new Node(num);
        for(int i=0;i<n-1;i++){
            int num;
            cin>>num;
            tail->next=new Node(num);
            tail=tail->next;
        }
        Solution ob;
        Node *temp=ob.primeList(head);
        while(temp!=NULL){
            cout<<temp->val<<" ";
            temp=temp->next;
        }
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends