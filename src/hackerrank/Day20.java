
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        
        int tmp;
        int sayac = 0;
        int i, j;

        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    sayac++;
                }
            }

        }
        System.out.println("Array is sorted in " + sayac + " swaps.");
        System.out.println("First element: " + a[0]);
        System.out.println("Last element: " + a[a.length - 1]);

    }
}
