import java.util.Scanner;

public class Discount {
  public static void main(String[] args) {
    double amount,discount,billRecipt;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the amount  from 1000 for purchases");
    amount=sc.nextInt();
    

    if(amount<5000)
    {
     discount=amount*0.05;
     billRecipt=amount-discount;
    
    }
    else{
        if(amount<10000){
            discount=amount*0.1;
            billRecipt=amount-discount;
    

        }
        else{
            if(amount<20000){
                discount=amount*0.15;
                billRecipt=amount-discount;
    

            }
            else{
                discount=amount*0.25;
                billRecipt=amount-discount;
    

            }
        }
    }
  System.out.println("the discount is:"+discount);
  System.out.println("the bill recipt is:"+billRecipt);
  sc.close();
    }


  }  

