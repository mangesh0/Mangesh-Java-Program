package Function;

import java.util.Scanner;

public class AreaF {
    public static int area(int a, int b){
        int result = a*b;
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of A and B: ");
        int x = in.nextInt();
        int y = in.nextInt();
        float result = area(x, y);
        System.out.println("The area is "+result+" squre uints");
        in.close();
    }

}
