package Function;

import java.util.Scanner;

public class LeapYear {
   public static void LP(int n){
    if (n%4==0 && n%100==0 || n%400==0) {
        System.out.print("A Leap Yaer: ");
    }
    else{
        System.out.println(" Not A Leap Year: ");
    }
   }
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a Year");
    int n = in.nextInt();
    LP(n);
    in.close();
   }
    
}