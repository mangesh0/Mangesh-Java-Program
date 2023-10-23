package Function;

import java.util.Scanner;

public class TringleCheck {
    public static void TringleCheck(int a, int b, int c)
       {
        if(a==b && b==c)
        System.out.println("Issoceles Tringle");
        else if(a==b && b==c && c==a)
        System.out.println("Equilateral Tringle");
        else
        System.out.println("Scalene Tringle");
       }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side A: ");
        int a = in.nextInt();
        System.out.print("Enter Side B: ");
        int b = in.nextInt();
        System.out.print("Enter Side C: ");
        int c = in.nextInt();
        TringleCheck(a, b, c);
        System.out.println();
        in.close();
    }
}
