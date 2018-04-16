import java.io.*;
import java.util.*;

public class Day06 {
	
    public static void main(String[] args) {
	
        Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();
        int i=0;
        
        String[] S = new String[T];
        
        while(i<T) {
            S[i] = scan.next(); 
            i++;
        }
        
        i=0;
        while (i<T) {
            int k=0;
            while(k<S[i].length()) {
                System.out.print(S[i].charAt(k));
                k+=2;
            }
            k=1;
            System.out.print(" ");
            while(k<S[i].length()) {
                System.out.print(S[i].charAt(k));
                k+=2;
            }
            System.out.println();
            i++;
        }
        
        scan.close();
    }
}