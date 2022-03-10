import java.util.Scanner;

class Grosssalary
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the salary");
int s=sc.nextInt();
double da=0.10*s;
double hra=0.15*s;
double gs=s+da+hra;
System.out.println("The gross pay is "+gs);
}
}
