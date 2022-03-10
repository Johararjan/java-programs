import java.util.Scanner;

class Armstrong
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter a number");
		int n=sc.nextInt();
		int r,t,s=0;
		t=n;
		while(n!=0)
		{
			r=n%10;
			s=s+(r*r*r);
			n=n/10;
		}
		if(t==s)
		{
			System.out.println("the number is armstrong number");
		}
		else
		{
			System.out.println("the number is not armstrong number");
		}
	}
}