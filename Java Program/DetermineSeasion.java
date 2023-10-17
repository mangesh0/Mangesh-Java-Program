import java.util.Scanner;

public class DetermineSeasion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choise;
        while (true) {
            System.out.println("1.Janaury");
            System.out.println("2.February");
            System.out.println("3.March");
            System.out.println("4.April");
            System.out.println("5.May");
            System.out.println("6.June");
            System.out.println("7.July");
            System.out.println("8.August");
            System.out.println("9.September");
            System.out.println("10.Octuber");
            System.out.println("11.November");
            System.out.println("12.December");
            System.out.println("enter the above option");
            choise=sc.nextInt();
            switch (choise) {
            case 3:
            case 4:
            case 5:
            System.out.println("this month is spring");
            System.out.println("");
            break;
            case 6:
            case 7:
            case 8:
            System.out.println("this month is summer");
            System.out.println("");
            break;
            case 9:
            case 10:
            case 11:
            System.out.println("this month is autumn");
            System.out.println("");
            break;

           case 12:
           case 1:
           case 2:
           System.out.println("this month is winter");
           System.out.println("");
            break;
            default:
            System.out.println("please enter above option");


            }

          sc.close();
        }
           
    
    }
}
