#User function Template for python3

class Solution:
    def minVal(self, a, b):
        #code here
        def countBits(x):
            res=0
            while x>0:
                if x%2:
                    res+=1
                x//=2
            return res
        def convert(x):
            res=""
            while x>0:
                res=str(x%2)+res
                x//=2
            return res
        def decimal(x):
            res=0
            base=1
            i=len(x)-1
            while i>=0:
                res+=base*(int(x[i]))
                base*=2
                i-=1
            return res
        curr=convert(a)
        count=countBits(b)
        # print(count)
        i=0
        ans=[]
        while i<len(curr):
            if curr[i]=="1":
                if count>0:
                    ans+=["1"]
                    count-=1
                else:
                    ans+=["0"]
            else:
                ans+=["0"]
            i+=1
        index=len(ans)-1
        # print(ans,curr,index)
        while count>0 and index>=0:
            # print(index)
            if ans[index]=="0":
                ans[index]="1"
                count-=1
            index-=1
        while count>0:
            ans+=["1"]
            count-=1
        
        return decimal(ans)


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import atexit
import io
import sys

_INPUT_LINES = sys.stdin.read().splitlines()
input = iter(_INPUT_LINES).__next__
_OUTPUT_BUFFER = io.StringIO()
sys.stdout = _OUTPUT_BUFFER

@atexit.register

def write():
    sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())

if __name__=='__main__':
    t = int(input())
    for i in range(t):
        a = int(input())
        b = int(input())
        
        ob= Solution()
        print(ob.minVal(a,b))
# } Driver Code Ends