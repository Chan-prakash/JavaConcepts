package pattern;
import java.util.*;
public class pattern8 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i =n;i>0;i--) {
			for(int j =1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		
	}}


/*
12345
1234
123
12
1
*/