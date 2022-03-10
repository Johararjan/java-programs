import java.util.Scanner;

class Evenodd
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of array");
    int n=sc.nextInt();
    int a[]=new int[n];
    int e[]=new int[n];
    int o[]=new int[n];
    int co=0,ce=0;
    System.out.println("enter "+n+" elements");
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
        if(a[i]%2==0)
        {
            e[ce]=a[i];
            ce++;
        }
        else{
            o[co]=a[i];
            co++;
        }
    }
    System.out.println("the even array is:");
    for(int i=0;i<ce;i++)
    {
        System.out.println(e[i]);
    }
    System.out.println("the odd array is:");
    for(int i=0;i<co;i++)
    {
        System.out.println(o[i]);
    }

    }
}