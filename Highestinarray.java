import java.util.Scanner;

class Highestinarray
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter size of array");
		int n=sc.nextInt();
		int a[]=new int[10];
		System.out.println("enter "+n+" numbers");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int temp=0;
		 for(int i=0; i < n; i++)
		{  
                 for(int j=1; j < (n-i); j++)
			{  
                          if(a[j]< a[j-1])
				  {  
                           temp = a[j-1];  
                           a[j-1] = a[j];  
                           a[j] = temp;  
                         }  
                          
                 }  
            }
		System.out.println("the largest number is "+a[n-1]);
		System.out.println("the lowest number is "+a[0]);
}
}

