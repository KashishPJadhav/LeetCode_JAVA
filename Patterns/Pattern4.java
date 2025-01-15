import java.util.Scanner;
public class Pattern4
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+"");
            }
            System.out.print("\n");
        }

    }
}