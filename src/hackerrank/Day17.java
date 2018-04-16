import java.util.*;
import java.io.*;


class Calculatore  {
    
    Calculatore() {
    }
    
    int power(int n, int p) throws negativeException {
        int sonuc=1;
        if(n>=0 && p>=0 ) {
            for (int i=0 ; i<p ; i++)
                sonuc=sonuc*n;                            
            return sonuc;
        }
        else {
           throw new negativeException(); 
        }
    }
    
    class negativeException extends Exception {
        
        @Override
        public String getMessage() {
            return "n and p should be non-negative";
        }
        
    }
}


class Day17{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculatore myCalculator = new Calculatore();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
