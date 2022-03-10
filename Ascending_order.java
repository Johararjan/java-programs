import java.util.Scanner;

class Ascending_order
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter 3 numbers");
		int a[]=new int[3];
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < 3; i++) 
        	{	
			int temp;
            	for (int j = i + 1; j < 3; j++) 
           		{
                		if (a[i] > a[j]) 
                		{
                    		temp = a[i];
                    		a[i] = a[j];
                   		a[j] = temp;
                		}
            	}
        	}
		System.out.println("the highest number is "+a[2]);
		System.out.println("the number in ascending order is");
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		
		}
	}
}
