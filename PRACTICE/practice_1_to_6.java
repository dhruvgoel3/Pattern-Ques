package PRACTICE;

import java.util.Scanner;

public class practice_1_to_6 {
    static void pattern1(int n)

    {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern3(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(1);
            }
            System.out.println();
        }

    }
    static void pattern4(int n)
    {
        for(int i = 1; i<n; i++)
        {
            for(int j = 1; j<=i; j++) 
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void pattern5(int n)
    {
        for(int i = 0; i<=n; i++)
        {
            for(int j = 0; j<n-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(int n)
    {
        for(int i = 0; i<=n; i++)
        {
            for(int j = 1; j<n-i+1; j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern6(n);

    }

}
