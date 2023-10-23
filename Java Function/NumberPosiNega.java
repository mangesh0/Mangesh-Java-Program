package Function;

import java.util.Scanner;

public class NumberPosiNega {
    public static void number(int n){
        if(n>0) System.out.println("Number is Positive: "+n);
        else System.out.println("Number is Negative: "+n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the any number");
        int n = in.nextInt();
        number(n);
        in.close();
    }
}
