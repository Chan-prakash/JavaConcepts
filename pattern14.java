package pattern;
import java.util.*;
public class pattern14{
	static void patter14(int n) {
		int start =1;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				start=1;
			}
			else {
				start=0;
			}
		for(int j=0;j<=i;j++) {
			System.out.print(start);
			start=1-start;
		}
		
		System.out.println();
			
		}
	}
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n =scan.nextInt();
		patter14(n);
		
	}
}
/*
1
01
101
0101
10101
 */





