/*program to calculate commission of salesman according
to the given rate using nested-if statement
sales value              comm.rate
0 to 5000                  0%
5000 to 10000              5%
10000 to 20000             10%
20000 to 30000             12%
above to 30000             15%
 */
import java.util.Scanner;
public class CommissionOfSales {
public static void main(String[] args) {
double sales,comm;
Scanner r=new Scanner(System.in);
System.out.println("enter the sales value");
sales =r.nextDouble();
if(sales<5000) 
{
 comm=sales*0;

} 
else
{
  if(sales<10000)
  {
   comm=sales*0.05;

  }
 else
 {
   if(sales<20000)
   {
   comm=sales*0.1;

   }
  else
  {
   if(sales<30000)
   {
    comm=sales*0.12;

   }
   else
   {
    comm=sales*0.15;

   }
   r.close();

  }

 } 

}
System.out.println("the commission is:"+comm);
System.out.println("thanks");
    
} 
    
}

