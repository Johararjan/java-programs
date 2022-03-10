import java.util.Scanner;

class Multiplyby4
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int n1=n*4;
int t=0,r=0;
while(n!=0)
{

r=n%10;
t=t*10+r;
n=n/10;
}
if(n1==t)
{
System.out.println("the number is valid according to the given conditions");
}
else
{
System.out.println("the number is not valid accoring to the given conditons");
}
}
}
