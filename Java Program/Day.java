import java.util.Scanner;

public class Day {
    public static void main(String[] args) {       
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
   int n= sc.nextInt(); 
   if(n==1)
     System.out.println("Monday");
    else if(n==2)
    System.out.println("Tuesday");
    else if(n==3)
    System.out.println("wednesday");
    else if(n==4)
    System.out.println("thursday");
    else if(n==5)
    System.out.println("friday");
    else if(n==6)
    System.out.println("sataurday");
    else if(n==7)
    System.out.println("sunday");
   else
   System.out.println("please enter the vailed number ");


  sc.close();
    }
}
