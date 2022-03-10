import java.util.Scanner;

public class primeinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int p[]=new int[n];
        int pi=0;
        System.out.println("enter array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            int c=0;
            for(int j=1;j<=n;j++)
            {
                if(a[i]%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                p[pi]=a[i];
                pi++;
            }
        }
        System.out.println("the Prime numbers are:");
        for(int i=0;i<pi;i++)
        {
            System.out.println(p[i]);
        }

    }
}
