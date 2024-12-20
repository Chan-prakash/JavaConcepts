package pattern;

import java.util.Scanner;

public class pattern5 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		for( int i =n;i>0;i--) {
			for(int j=n;j>0;j--) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
	}

}
