import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int maks=-100,i=0,j=0,toplam=0;
        while(j<4) {
            while(i<4) {
                toplam = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if (toplam>maks) {
                    maks=toplam;
                }
                toplam=0;
                i++;
            }
            j++;
            i=0;
        }
        
        System.out.println(maks);
        
        
        
        
    }
}