import java.util.Scanner;
public class RecursiveFibonacci {
    public static int fibo(int n)
    {
        if(n<=1)
        {
            return n;
        }
         return fibo(n-1)+fibo(n-2);

    }
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter : ");
       int n=sc.nextInt();
       if (n <= 0) {
        System.out.println("Please enter a positive number.");
    }
    else
    {
        System.out.print("Fibonacci : ");
        for(int i=0;i<n;i++)
        {
         System.out.print(fibo(i)+ " ");
        }
        
    }
       
    }
    
}
