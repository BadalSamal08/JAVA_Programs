import java.util.*;
public class Chnglst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,i,j,n;
        System.out.println("Enter the no.of elements of the 1st array :");
        a=sc.nextInt();
        System.out.println("Enter the no.of elements of the 2nd array :");
        b=sc.nextInt();
        int c[]=new int[a];
        int d[]=new int[b];
        System.out.println("Enter the elements of the 1st array :");
        for( i=0;i<a;i++)
            c[i]=sc.nextInt();
        System.out.println("Enter the elements of the 2nd array :");
        for(i=0;i<b;i++)
            d[i]=sc.nextInt();
        for(i=(a-1);i>=3;i--)
        {
            n=c[i];
            c[i]=d[i];
            d[i]=n;
        }
        for( i=0;i<a;i++)
            System.out.println(c[i]);
        for( i=0;i<b;i++)
           System.out.println(d[i]);
    }
}
