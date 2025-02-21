package pattern;
import java.util.*;
public class pattern12 {
	static void pattern(int n) {
		int stars;
		for(int i=0;i<2*n-1;i++) {
			stars=i;
			if(i>n) {stars=2*n-i-1;}
			for(int j=0;j<stars;j++) {
				System.out.print("*");
			}   
			System.out.println();
		}
		
		
	}
	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		pattern(n);
		
	}

}
/*
*
**
***
****
*****
***
**
*
*/
