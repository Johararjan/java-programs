import java.util.Scanner;

class Largestof3if
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int l=0;
		if(a>=b && a>=c)
		{
			l=a;
		}
		if(b>=a && b>=c)
		{
			l=b;
		}
		if(c>=a && c>=b)
		{
			l=c;
		}
		System.out.println("the largest number is "+l);
	}
}
