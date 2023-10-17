import java.util.Scanner;

public class MaxTwoNo {
public static void main(String[] args) {
int a,b;       
System.out.println("enter the first number");
Scanner r=new Scanner(System.in);
 a=r.nextInt();
System.out.println("enter the second number");
b=r.nextInt();
if(a>b)
{
System.out.println("the maximum number is:"+a);
}
else{

System.out.println("the maximum number is:"+b);

}
r.close();

} 

}
