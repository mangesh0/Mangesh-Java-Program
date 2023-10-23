package Function;

import java.util.Scanner;

public class Reverse {
    public static void rev(int n){
        int  rev = 0;
        while (n != 0) {
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        System.out.println(" Reverse numbe is: "+rev);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print(" Enter the number: ");
        int n = in.nextInt();
        rev(n);
        in.close();
    }
}
