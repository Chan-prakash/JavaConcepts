package concepts;
import java.util.*;
public class hashing1 {
	public static void main (String []args) {
		Scanner scan = new Scanner 	(System.in);
		String input =scan.next();
		
		// precalculation
		int []hash = new int[26];
		for(int i=0;i<input.length();i++) {
			hash[input.charAt(i)-'a']++;
			
		}
		
		int cout = scan.nextInt();
		while(cout>0) {
			char c = scan.next().charAt(0)	;
		    System.out.println(hash[c -'a']);
		    cout--;
		}
		
		
	}
	

}
