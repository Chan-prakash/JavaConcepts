package pattern;
import java.util.*;
public class pattern11 {
   static void normal(int n){
	   for(int i=0;i<n;i++) {
	         for(int j=0;j<n-i;j++) {
			 System.out.print(" ");
		}
	         for(int k=0;k<2*i+1;k++) {
	  		   System.out.print("*");
	  	   }
	         for(int j=0;j<n-i;j++) {
				 System.out.print(" ");
			}
	         System.out.println();
	         
	   }
   }
   
  static void inverted(int n) {
	  for(int i =0;i<=n;i++) {
		  for(int j=0;j<=i;j++) {
			  System.out.print(" ");
		  }
		  for(int j=0;j<2*n-(2*i+1);j++) {
			  System.out.print("*");
		  }
		  for(int j=0;j<=i;j++) {
			  System.out.print(" ");
		  }
		  System.out.println();
		  
	  }
  }
   public static void main(String[]args) {
	   Scanner scan =new Scanner(System.in);
	   int n =scan.nextInt();
	   normal(n);
	   inverted(n);
	   
   }
	
	
}
/*
    *    4 1 4
   ***   3 3 3
  *****  2 5 2
 ******* 1 7 1
*********0 9 0
*********0 9 0
 ******* 1 7 1
  *****  2 5 2 
   ***   3 3 3
    *     4 1 4
    * 
 */
