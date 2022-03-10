import java.util.Scanner;

class fahrenheittocel
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temperature in fahrenheit");
		double f=sc.nextDouble();
		double c=(f-32)*(5/9.0);
		System.out.println("the temperature in celsius is "+c);
	}
}

