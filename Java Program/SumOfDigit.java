import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        int r,n,sum=0;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        while(n>0){
           r=n%10;
            n= n/10;
            sum=sum+r;
        }
         System.out.println("the sum of this number is"+sum);
        sc.close();
    }
}
