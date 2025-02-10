package binarysearchtree;
import java.io.*;
import java.util.*;
import java.util.*;

class Solution {
    static int findFloor(int[] arr, int k) {
        int ans = -1;
        int low = 0, high = arr.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] == k) return arr[mid];
            if (arr[mid] > k) high = mid - 1;
            else {
                ans = arr[mid];
                low = mid + 1;
            }
        }
        return ans;
    }
}

public class lowerbound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter sorted array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        Solution ob = new Solution();
        int ans = ob.findFloor(arr, k);
        
        System.out.println("Floor of " + k + " is: " + ans);
        
        sc.close();
    }
}
