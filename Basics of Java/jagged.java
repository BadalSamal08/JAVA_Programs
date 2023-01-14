import java.util.*;
class jagged
{
	public static void main(String args[])
	{
		int i,j,k,r;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		r=sc.nextInt();
		int a[][]= new int[r][];
		int c[]=new int[r];
		for( i=0;i<r;i++)
		{
			int b=0;
			System.out.println("Enter the numbers coloumns in "+(i+1)+"th row");
			b=sc.nextInt();
			c[i]=b;
			a[i]=new int[b];
		}
		for( k=0;k<r;k++)
		{
			for( j=0;j<c[k];j++)
			{
				System.out.println("Enter the element:");
				a[k][j]=sc.nextInt();
			}
			System.out.println();
		}
		for( i=0;i<r;i++)
		{
			for( j=0;j<c[i];j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}