package pattern;

public class pattern7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {  // Outer loop controls the rows
            for (int j = 5; j >= i; j--) {  // Inner loop prints numbers based on row number
                System.out.print(j);
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}

/*
 54321
5432
543
54
5
*/

