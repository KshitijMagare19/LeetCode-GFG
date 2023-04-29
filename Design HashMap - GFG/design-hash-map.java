//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      MyHashMap obj=new MyHashMap();
      int q=sc.nextInt();
      sc.nextLine();
      while(q-->0)
      {
        String s=sc.next();
            if (s.equals("put"))
            {
                int key=sc.nextInt(), val=sc.nextInt();
               
                obj.put(key, val);
            }
            else if ( s.equals("remove")) {
                int key=sc.nextInt();
               
                obj.remove(key);
            }
            else {
                int key=sc.nextInt();
                System.out.println(obj.get(key));
               
            }  
      }
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class MyHashMap {
    int[] arr = new int[100001];

    /** Initialize your data structure here. */
    MyHashMap() {
        Arrays.fill(arr,-1);
    }

    /** value will always be non-negative. */
    void put(int key, int value) {
        arr[key] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    int get(int key) {
        return arr[key];
        
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    void remove(int key) {
        arr[key] = -1;
    }

}