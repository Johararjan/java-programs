import java.util.Scanner;

class Pattern6
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter size");
		int n=sc.nextInt();
		System.out.println("the pattern is");
		for(int i=1;i<n+1;i++)
    		{
       		for(int s=n+1-i;s>1;s--)
       		{
         			System.out.print(" ");
       		}
   
       		for(int j=i;1<=j;j--)
       		{
        			 System.out.print(j);
       		}

       		for(int k=2;k<=i;k++)
       		{
        			System.out.print(k);
       		}

       		System.out.println();
     		}
	}
}