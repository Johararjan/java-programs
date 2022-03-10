import java.util.Scanner;

class Reverseofno
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int r=0,n1=0;
int t=n;
while(n!=0)
{
r=n%10;
n1=n1*10+r;
n=n/10;
}
System.out.println("the reverse of "+t+" is "+n1);
}
}
