import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        if(i%2==0){
            System.out.println("the even no. is"+i);
        }
    else{
        System.out.println("the odd no. is"+i);
    }
    }     

    sc.close();



    }
}
