import java.util.Scanner;

class Evenseries
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter upper limit");
		int n=sc.nextInt();
		System.out.println("the even series is:");
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}