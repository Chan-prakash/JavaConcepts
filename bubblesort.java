package concepts;
import java.util.*;
public class bubblesort {
	static void  bubble(int []arr) {
		int n =arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++ ) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	   for(int n1:arr) {
		   System.out.println("Array is element "+n1);
	   }
		
	}
	public static void main(String[]args) {
		int arr[]= {9,5,4,3,3};
		bubble(arr);
		
	}

}
