import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;
    
    Difference (int[] dizi) {
        elements=dizi;
    }
        
    public void computeDifference() {
        maximumDifference=0;
        int fark;
        for (int i=0 ; i<elements.length ; i++) {
            for(int k=i+1 ; k<elements.length ; k++) {
              fark= Math.abs(elements[i]-elements[k]);
              if(fark>maximumDifference) {
                  maximumDifference = fark;
              }
            }
        }
       
    } 

         
         
         
         
} // End of Difference class

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}