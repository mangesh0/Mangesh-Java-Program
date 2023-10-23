package Function;
// Using Object Class
import java.util.Scanner;
class cal{
     int a,b;
    // Constructer 
    cal(int x, int y){
        System.out.println("Constructer of Algebra class called");
        a=x;
        b=y;
    }
    int sum(){
        int ans = a + b;
        return ans;
    }
    int sub(){
        int ans = a - b;
        return ans;
    }
    float mul(){
        int ans =  a*b;
        return ans;
    }
float div(){
    float ans = a/b; 
    return ans;
}
}
public class Calculator {
   public static void main(String[] args) {
    cal obj = new cal( 6 ,2);
    Scanner in = new Scanner(System.in);
   
    // System.out.println();
    // int ans = obj.sum(x,y );
    System.out.println("Sum of the two number is: "+obj.sum());
    System.out.println();
  //  int ans1 = obj.sub( x,y);
    System.out.println("Sub of the two number is: "+obj.sub());
    System.out.println();
  //  float ans2 = obj.mul( x,y);
    System.out.println("Mul of the two number is: "+obj.mul());
    System.out.println();
   // float ans3 = obj.div( x,y);
    System.out.println("Div of the two number is: "+obj.div());
    in.close();
    System.out.println();
    
   // Standard Library Function's
   // print,maths,sqrt,floor and ceil
   System.out.println("Standrd Library Function");
        System.out.println(Math.sqrt(24));
        System.out.println(Math.sqrt(16));

        System.out.println(Math.floor(5.3));
        System.out.println(Math.floor(5.8));

        System.out.println(Math.ceil(5.3));
        System.out.println(Math.ceil(5.8));

         System.out.print("Enter the value of A: ");
          int x = in.nextInt();
         System.out.print("Enter the value of B: ");
          int y = in.nextInt();

        cal obj1 = new cal( x ,y);
          System.out.println("Sum of the two number is: "+obj1.sum());
             System.out.println();
           System.out.println("Sub of the two number is: "+obj1.sub());
             System.out.println();  
            System.out.println("Mul of the two number is: "+obj1.mul());
              System.out.println();  
             System.out.println("Div of the two number is: "+obj1.div());
   // in.close();
                System.out.println();   
   }



           
}
