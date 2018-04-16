import java.io.*;
import java.util.*;

public class Day10 {
    
    public static void main(String[] args) {
        int i=0;
        int maksTekrar=1;
        int tekrar=1;
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        String sayi;
        sayi = Integer.toString(x,2);
        System.out.println(sayi);
        
        while(i<sayi.length()-1) {
            if(sayi.charAt(i)==sayi.charAt(i+1)) {
                tekrar++;
                if(tekrar>maksTekrar) {
                maksTekrar=tekrar;
                }
            }
            else {
                tekrar=1;
            }
            i++;
        }
        System.out.println(maksTekrar);
    }
}
