import java.util.Scanner;

class Sumof10
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter 10 numbers");
		int a[]=new int[10];
		int s=0;
		float avg=0;
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			s=s+a[i];
		}
		avg=s/10;
		System.out.println("the sum is "+s+" and the average is "+avg);
	}
}