package Function;
import java.util.Scanner;
public class InsComp {
public static void PrintPrimium(int age,int gen,int city){
    if(age>=25&&age<=35&&gen==1&&city==1)
    System.out.println("Primium\t: 6%\n");
    else if(age>=25&&age<=40&&gen==1&&city==2)
    System.out.println("Primium\t: 4%\n");
    else if(age>=25&&age<=42&&gen==2&&city==1)
    System.out.println("Primiun\t: 3%\n");
    else if(age>=25&&age<=45&&gen==2&&city==2)
    System.out.println("Primium\t: 2%\n");
    else
    System.out.println("Primium\t: Not Insured\n");
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("\n************<INPUT>************\n");
        System.out.print("\nEnter Name:\t");
        String name=sc.nextLine();
        System.out.print("\n1.Male\n2.Female\n\nSelect Gender:\t");
        int gen=sc.nextInt();
        System.out.print("\nEnter Age:\t");
        int age=sc.nextInt();
        System.out.print("\n1.Metro City\n2.Non-Metro City\n\nSelect City:\t");
        int city=sc.nextInt();
        sc.close();
        System.out.println("\n************<OUTPUT>************\n");
        System.out.println("Name\t: "+name);
        System.out.println("Gender\t: "+(gen==1?"Male":"Female"));
        System.out.println("City\t: "+(city==1?"Metro":"Non-Metro"));
        PrintPrimium(age,gen,city);
    }
}
