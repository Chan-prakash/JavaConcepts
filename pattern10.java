package pattern;
import java.util.*;
public class pattern10 {
	public static void main(String[]args) {
		Scanner scan =new Scanner(System.in);
		int N= scan.nextInt();
		for(int i=0;i<N;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j< 2*N -(2*i +1);j++) {
				System.out.print("*");
				
			}
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
	
	}

	
}
/*
*********    0 9 0
 *******     1 7 1 
  *****      2 5 2
   ***       3 3 3
    *        4 1 4
*/