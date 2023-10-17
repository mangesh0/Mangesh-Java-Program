import java.util.*;
public class greatestnumber{
    public static void main(String[] args) {
        System.out.println("enter the value of a");
        Scanner sc= new Scaanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        Scanner ss= new Scaanner(System.in);
        int b = ss.nextInt();
        System.out.println("enter the value of c");
        Scanner sr= new Scanner(System.in);
        int c = sr.nextInt();
        System.out.println(a>b?(a>c?"a is greatest"):b>a?(b>c?"bis greatest"):c>a?(c>b?"c is greatest"));
        sc.close();
        
    }
}