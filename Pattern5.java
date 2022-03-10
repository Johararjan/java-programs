import java.util.Scanner;

class Pattern5
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter size");
		int n=sc.nextInt();
		System.out.println("the pattern is");
		for(int i=0;i<n;i++)
		{
			for(int j=65;j<=65+i;j++)
			{
				System.out.printf("%c ",j);
			}
			System.out.println("");
		}
	}
}