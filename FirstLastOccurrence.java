package binarysearchtree;
import java.util.*;
public class FirstLastOccurrence {  // other version in leetcode.
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        int count=0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
            	count+=1;
                result = mid;
                high = mid - 1; // Search in the left half
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1; // Search in the right half
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
    

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5, 5, 5, 6};
        int target = 2;
        System.out.println("First Occurrence: " + firstOccurrence(arr, target));
        System.out.println("Last Occurrence: " + lastOccurrence(arr, target));
    }
}
