import java.util.Scanner;

class Numbertoword
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the upper limit");
int n=sc.nextInt();
String s[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
String s1[]=new String[10];
int r=0,j=0;
while(n!=0)
{
r=n%10;
s1[j]=s[r];
j++;
n=n/10;
}
for(int i=j-1;i>=0;i--)
{
System.out.println(s1[i]);
}
}
}