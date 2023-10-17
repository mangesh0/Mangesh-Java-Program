import java.util.Scanner;

public class Factorial {
   public static void main(String[] args) {
    int fact=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number for factorial");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++){
     if(n==0){
        fact=1;
     } 
    // else if(n==1){
     //fact=1;
    // }
    fact*=i;

     }
     System.out.println("the factorial is"+fact);
      sc.close();
   } 
}
