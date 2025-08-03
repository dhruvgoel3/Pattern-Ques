// * 
// * * 
// * * * 
// * * * * 
// * * * * *

import java.util.Scanner;

public class pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:- ");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {   // outer loop
            for (int j = 0; j <= i; j++) {  // inner loop
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
