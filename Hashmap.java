package concepts;
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Reading the size of the array
        int n = scan.nextInt();
        int[] arr = new int[n];

        // Reading the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Pre-calculation using HashMap
        HashMap<Integer, Integer> mp = new HashMap<>();              // <key ,value>
        for (int num : arr) {
            // Check if the number is already in the map
            if (mp.containsKey(num)) {                          // checking the key
                // Increment its frequency
                mp.put(num, mp.get(num) + 1); // (key,value)
            } else {
                // Add the number with frequency 1
                mp.put(num, 1);
            }
        }

        // Display the frequency of each element
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
        
        int q= scan.nextInt();
        while(q-->0) {
            int n1=scan.nextInt();
        	if(mp.containsKey(n1)) {
        		System.out.println(mp.get(n1));
        	}
        	else
        		System.out.println(0);
        }
          
        scan.close();
    }
}

