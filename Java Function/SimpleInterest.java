package Function;

import java.util.Scanner;

public class SimpleInterest {
     static int si(int a, int b, int c){
        int si = (a*b*c)/100;
        return si;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of A ,B and C: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        float result = si( a, b, c);
        System.out.print("Simple Interest is: "+(result)); 
        in.close();
    }
}
