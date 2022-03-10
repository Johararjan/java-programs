import java.util.Scanner;

class Perfectsquare
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
if(Math.sqrt(n)==Math.floor(Math.sqrt(n)))
{
int fn=n/100;
int ln=n%100;
double s1=Math.sqrt(fn);
double s2=Math.sqrt(ln);
if(s1==Math.floor(s1) && s2==Math.floor(s2))
{
System.out.println("the number "+n+" is the perfect square");
}
else
{
System.out.println("the number "+n+" is not a perfect square");
}
}
else
{
System.out.println("the number "+n+" is not a perfect square");
}
}
}
 