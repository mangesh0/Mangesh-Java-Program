import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check prime or not");
        int n=sc.nextInt();
        int flag=0,i;
       for(i=1;i<=n;i++){
        if(n%i==0){
            flag=1;
        }

          }
          if(flag==1){
            System.out.println("the primr number is"+i);
          }
        sc.close();

    }
}
