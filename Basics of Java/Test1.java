import java.util.*;
class A extends Thread{
	int arr[]=new int[10];
	int sum=0;
	int start,end;
	A(int a[],int n,int s,int e)
	{
		start=s;
		end=e;
		for(int i=0;i<n;i++)
		{
			arr[i]=a[i];
		}
	}
	public void run()
	{
		for(int i=start;i<=end;i++)
		{
			sum=sum+arr[i];
			
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
			System.out.println(Thread.currentThread().getName()+"="+sum);
		
	}
}
class Test1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements of array");
		int c=sc.nextInt();
		int arr[]=new int[c];
		for(int i=0;i<c;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the no.of thread u want to create");
		int d=sc.nextInt();
		int x=c/d;
		A a1[]=new A[d];
		for(int i=0,j=0;i<d;i++,j=j+x)
		{
			a1[i]=new A(arr,c,j,j+x-1);
			a1[i].start();
			try{
				a1[i].join();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
