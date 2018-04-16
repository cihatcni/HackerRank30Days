import java.io.*;
import java.util.*;


public class Day07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        int i=0;
        int tmp;
        while (i<(n/2)) {
            tmp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=tmp;
            i++;
        }
        
        for(i=0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        
        
        
        in.close();
    }
}
