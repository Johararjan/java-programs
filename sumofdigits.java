    import java.util.Scanner;

class Sumofdigits
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int s=0,r;
int t=n;
while(n!=0)
{
r=n%10;
s=s+r;
n=n/10;
}
System.out.println("the sum of digits of "+t+" is "+s);
}
}
