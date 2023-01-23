//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().convert(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    void convert(int[] arr, int n) {
        // code here
        int temp[] = arr.clone();
 
        // Sort temp array
        Arrays.sort(temp);
 
        // Create a hash table.
        HashMap<Integer, Integer> umap = new HashMap<>();
 
        // One by one insert elements of sorted
        // temp[] and assign them values from 0
        // to n-1
        int val = 0;
        for (int i = 0; i < n; i++)
            umap.put(temp[i], val++);
 
        // Convert array by taking positions from
        // umap
        for (int i = 0; i < n; i++)
            arr[i] = umap.get(arr[i]);
    }
}