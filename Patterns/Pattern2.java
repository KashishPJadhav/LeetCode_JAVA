import java.util.Scanner;
public class Pattern2
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
