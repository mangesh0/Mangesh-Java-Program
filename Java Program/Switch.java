import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c;
    System.out.println("enter the menu option");
    System.out.println("1.addtion");
    System.out.println("2.subtraction");
    System.out.println("3.Multiplication");

    int choise = sc.nextInt();
    System.out.println("enter first number");
    a= sc.nextInt();
    System.out.println("enter second number");
     b= sc.nextInt();
    switch (choise) {
      case 1:
        c = a + b;
        System.out.println("the addtion of two number is" + c);
          break;
      case 2:
        c = a - b;
        System.out.println("subtraction of two number is" + c);
        break;
      case 3:
        c = a * b;
        System.out.println("the multiplication of two number is" + c);
      break;
      default:{
        System.out.println("invailed");
      }
    }
    sc.close();

  }
}
