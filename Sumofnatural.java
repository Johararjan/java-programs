import java.util.Scanner;

class Sumofnatural
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter no of terms");
		int n=sc.nextInt();
		int s=0;
		for(int i=1;i<=n;i++)
		{
			s=s+i;
		}
		System.out.println("the sum of "+n+" natural numbers is "+s);
	}
}
	