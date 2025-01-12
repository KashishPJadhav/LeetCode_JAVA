import java.util.Scanner;
public class PrimeNumberCheck {

	public static void main(String[] args) {
		System.out.print("Enter Number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Prime Number : ");
		System.out.println(isPrime(n)); // false
        sc.close();
	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}