import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
     int a=sc.nextInt();
      System.out.println((a%2==0)?"even no.":"odd no."); 

    sc.close();


    }
}
