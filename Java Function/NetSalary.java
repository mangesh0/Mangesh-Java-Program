package Function;

import java.util.Scanner;

public class NetSalary {
    public static void Salary(float basic, float allowances){
        float HRA,DA,TA,sum;
        HRA = (basic*30)/100;
        System.out.println("Basic Salary of HRA:\t"+HRA);
        DA = (basic*20)/100;
        System.out.println("Basic Salary of DA:\t"+DA);
        TA = (basic*10)/100;
        System.out.println("Basic Salary of TA:\t"+TA);
        sum = basic + allowances - 1400;
        System.out.println("Total Net Salary is:\t"+sum);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the Basic Salary:\t");
        float baS = in.nextFloat();
        System.out.print("Enter the Allowances:\t");
        float allow = in.nextFloat();
        System.out.println();
        Salary(baS, allow);
        in.close();
        
    }
}
