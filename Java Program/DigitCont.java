import java.util.Scanner;

public class DigitCont {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nuber");
        int n = sc.nextInt();
        while(n>0){
       n=n/10;
     count=count+1;
     
        }
        System.out.println("the number is"+count);
        sc.close();
    }
}
