import java.util.Scanner;

class GCD
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter 1st number");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int n2=sc.nextInt();
		while(n1!=0)
		{
			n1=n2%n1;
			n2=n1;
			
		}
		System.out.println("the gcd of is "+n1);
	}
}
		
		
		