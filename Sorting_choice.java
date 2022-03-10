import java.util.Scanner;	
class Sorting_choice
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");	
		int n=sc.nextInt(n);
		int a[]=new int[n];
		int s[]=new int[n];
	 	System.out.println("Enter 1.for Bubble Sort \n2.for Selection Sort\n3.for Insertion Sort");
		int c=sc.nextInt();
		Sortingmethods s1= new Sortingmethods();
		switch(c)
		{
		case 1:
		s=s1.bubblesort([]a);
		break;
		case 2:
		s=s1.selectionsort([]a);
		break;
		case 3:
		s=s1.insertionsort([]a);
		break;
		}
		System.out.println("the sorted array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
	}
}
		
