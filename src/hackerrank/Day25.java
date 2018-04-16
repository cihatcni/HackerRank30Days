
import java.io.*;
import java.util.*;

public class Day25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kacSayi = sc.nextInt();

        while (kacSayi-- > 0) {
            int sayi = sc.nextInt();
            int i = 2;
            while (i * i < sayi && sayi % i != 0) {
                i++;
            }

            if (sayi % i == 0 && sayi != 2) {
                System.out.println("Not prime");
            } else if (sayi < 2) {
                System.out.println("Not prime");
            } else {
                System.out.println("Prime");
            }
        }

    }
}
