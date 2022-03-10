import java.util.Scanner;

class Fibonnaci
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter no of terms");
		int n=sc.nextInt();
		int f=0,s=1,t;
		System.out.println("the series is");
		System.out.println(f);
		System.out.println(s);
		int i=0;
		while(i<n)
		{
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
			i++;
		}
	}
}
