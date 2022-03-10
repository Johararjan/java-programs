import java.util.Scanner;

class Sumaverageofarray
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("enter "+n+" numbers");
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		float avg=sum/n;
		System.out.println("the sum is "+sum+" and average is "+avg);
	}
}