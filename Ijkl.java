import java.util.Scanner;

class Ijkl
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the upper limit");
int n=sc.nextInt();
for(int l=1;l<=n;l++)
{
for(int k=1;k<=l;k++)
{
for(int j=1;j<=k;j++)
{
for(int i=1;i<=j;i++)
{
if(i+j+k==l)
{
System.out.printf("%d + %d + %d = %d\n",i,j,k,l);
}
}
}
}
}
}
}

