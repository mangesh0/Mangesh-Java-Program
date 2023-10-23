package Function;

import java.util.Scanner;

public class FibonacciF {
    public static void fibo(int n){
        int a = 0, b = 1, c = 1;
        System.out.println();
        System.out.print("Fibonacci Series is: "+a+", "+b+", ");
        for(int i=2; i<=n; i++){
            c = a+b;
            System.out.print(c+", ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Range: ");
        int n = in.nextInt();
        fibo(n);
        in.close();
    }
}
