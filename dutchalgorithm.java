package concepts;
import java.util.*;

public class dutchalgorithm {
	static  void sorting(int arr[]) {
		int n =arr.length;
		int low=0;
		int mid=0;
		int high=n-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				int temp=arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				low++;
				mid++;
			}
			else if(arr[mid]==1) {
				mid++;
			}
			else if(arr[mid]==2) {
				int temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
			}
			
		}
		
		
	}
	public static void main(String[]args) {
		int arr[]= {0,1,1,0,1,2,1,2,0,0,0};
		System.out.println("Before sorting");
		for(int i :arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		sorting(arr);
		System.out.println("After sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		
	}

}
