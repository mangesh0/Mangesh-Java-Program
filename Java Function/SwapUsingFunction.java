package Function;

import java.util.Scanner;

public class SwapUsingFunction {
    static void swap(int a , int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A = "+a+" B = "+b);
        return; 
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        int a = in.nextInt();
        System.out.print("Enter the value of B : ");
        int b = in.nextInt();
        System.out.println("Before swap nuumber is : A = "+a+" and B = "+b);
        swap(a, b);
        in.close();
    }
}
