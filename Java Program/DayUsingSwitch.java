import java.util.Scanner;
public class DayUsingSwitch {
public static void main(String[] args) {
int day;  
Scanner r=new Scanner(System.in);    
System.out.println("enter day number");
day=r.nextInt();
switch(day)
{
case 1:
{
 System.out.println("MONDAY");
 break;   
}
case 2:
{
 System.out.println("TUESDAY");
 break;   
}
case 3:
{
 System.out.println("WEDNESDAY");
 break;   
}
case 4:
{
 System.out.println("THURSDAY");
 break;   
}
case 5:
{
 System.out.println("FRIDAY"); 
 break;  
}
case 6:
{
 System.out.println("SATARDAY");
 break;   
}
case 7:
{
 System.out.println("SUNDAY");
 break;   
}
default:
{
 System.out.println("please enter upto 7 number");   
}
r.close();
}
System.out.println("thanks for see my code");

}    
    
}
