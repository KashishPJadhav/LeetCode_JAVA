import java.util.Scanner;
public class iterativeFibonacci
{
    public static void main(String[] args)
    {
        System.out.print("Enter : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
        {
            System.out.println("Please enter a positive number.");
        }
        else{
            System.out.print("Fibonacci : ");
            int a=0;
            int b=1;
            for(int i=1;i<=n;i++)
            {
                System.out.print(a+" ");
                int nt=a+b;
                a=b;
                b=nt;
            }
        }
    }
}