import java.io.*;
import java.util.*;

public class Day26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day1 = sc.nextInt();
        int month1 = sc.nextInt();
        int year1 = sc.nextInt();
        int day2 = sc.nextInt();
        int month2 = sc.nextInt();
        int year2 = sc.nextInt();
        
        int hackos;
        if (year1 <= year2) {
            if (month1 <= month2 || year1<year2) {
                if(day1 <= day2 || year1<year2) {
                    hackos = 0;                   
                }
                else {
                    hackos = (day1-day2)*15;
                }
            }
            else {
                hackos = (month1-month2)*500;
            }
        }
        else {
            hackos = 10000;
        }
        
        System.out.println(hackos);
        
        
        
        
        
        
        
        
        
        
    }
}