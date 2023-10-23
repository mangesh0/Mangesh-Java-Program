package Function;

import java.util.Scanner;

public class ArmstrongF {
    public static void armst(int n){
        int var = 0;
       
        String s = String.valueOf(n);
        String l = s.length();
        //temp = n;
        while(n != 0){
            int rem = n%10;
            var += Math.pow(rem,3);
            n = n/10;
        }
        if(var==temp){
            System.out.println("Number "+var+" is Armstrong :");
        }
        else System.out.println("Number "+var+" is not Armstroong :");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // System.out.println("Enter the number : ");
        int n = in.nextInt();
        armst(n);
        System.out.println();
       // in.close(); 
    }
}

/*

import java.util.Scanner;
public class  CheckArmstrongNumber {

public static  void main(String[] args) {
   int num, n, digit, digits, power, sum=0;

Scanner input = new Scanner(System.in);

System.out.print(“Enter a number to check for Armstrong Number:”);
num = input.nextInt();

String s = String.valueOf(num);
digits = s.length();
power = digits;

n = num;


while (n != 0)
{
digit = n % 10;
sum = sum + (int)Math.pow(digit,power);
n = n / 10;
}

if(num == sum)
System.out.println(num+” is an Armstrong Number”);
else
System.out.println(num+” is not an Armstrong Number”);

}

}

*/ 

