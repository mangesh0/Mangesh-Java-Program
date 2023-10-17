import java.util.Scanner;
public class Rhombus2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter Size:\t");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            
            for(j=i;j<n;j++)
            System.out.print("  ");
            for(j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
        for(i=1;i<=n;i++)
        {
            for(j=i;j<n;j++)
            System.out.print("* ");
            System.out.println();
        }
    }
}
//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 
// * * * *   
// * * *     
// * *       
// *