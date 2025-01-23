import java.util.Scanner;
import java.util.ArrayList;
public class Ass4_4_{
    public static void main(String[] args)
    {
        ArrayList<Integer> ar=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int c=1;
        while(c!=0)
        {
            System.out.print("0.Exit\n1.Enter elements\nEnter choice : ");
            c=sc.nextInt();
            switch(c)
            {
                case 1:
                System.out.print("Enter ele : ");
                int n=sc.nextInt();
                ar.add(n);
                break;
                
                case 0:
                System.out.println("Exiting....");
                break; 

                default :
                System.out.println("\nInvalid Choice.");
            }
        }
        System.out.println("List is : "+ar);
        System.out.print("Enter target : ");
        int t=sc.nextInt();
        for(int i=0;i<ar.size();i++)
    {
        for(int j=i+1;j<ar.size();j++)
        {
            for(int k=j+1;k<ar.size();k++)
            {
                if(ar.get(i)+ar.get(j)+ar.get(k)==t)
                {
                    System.out.println(ar.get(i)+" "+ar.get(j)+" "+ar.get(k)+" ");
                }
            }
        }
    }
    }
    
}