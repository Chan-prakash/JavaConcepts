package pattern;
import java.util.*;
public class pattern9 {
	public static void main(String[]args) {
	 Scanner scan = new Scanner(System.in);
	 int n =scan.nextInt();
     for(int i =1;i<=n;i++) {
    	 for(int j=0;j<n-i;j++) {
    		 System.out.print(" ");
    	 }
    	  for(int j=0;j<2*i-1;j++) {
    		  System.out.print("*");
    	  }
    	  
    	  for(int j=0;j<n-i;j++) {
     		 System.out.print(" ");
     	 }
    	  System.out.println();
     }
  }
}
/*
    *    4 1 4
   ***   3 3 3
  *****  2 5 2
 ******* 1 7 1
*********0 9 0
 */


