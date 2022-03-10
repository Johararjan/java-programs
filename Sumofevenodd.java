import java.util.Scanner;

class Sumofevenodd
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter no of terms");
		int n=sc.nextInt();
		int a[]= new int[n];
		int so=0,se=0;
		System.out.println("enter "+n+" numbers");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			{
				so=so+a[i];
			}
			else
			{
				se=se+a[i];
			}
		}
		System.out.println("the sum of even is "+se+" and the sum of odd numbers is "+so);

	}	
}
	
		
			
