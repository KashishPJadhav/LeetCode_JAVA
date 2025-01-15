import java.util.Scanner;
public class Pattern5
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
            for(int j=0;j<(2*i+1);j++)
            {
                System.out.print((j+1)+" ");
            }
            System.out.print("\n");
        }

    }
}
