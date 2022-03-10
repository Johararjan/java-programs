import java.util.Scanner;

class Octalandhex
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
String h=Integer.toHexString(n);
String o=Integer.toOctalString(n);
System.out.println("the hexadecimal of "+n+" is "+h);
System.out.println("the Octal of "+n+" is "+o);
}
}
