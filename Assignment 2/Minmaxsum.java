import java.util.*;
class MinmaxSum
{
	public static void main(String args[])
	{
		int m,n,i,j,temp,max,min,sum,difference;
		int a[]=new int[100];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of elements: ");
		n=s.nextInt();
		System.out.println("enter the values: ");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("after sorting: ");
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("enter m value: ");
		max=s.nextInt();
		System.out.println("enter n value: ");
		min=s.nextInt();
		System.out.println("mth max is: "+a[n-max]);
		System.out.println("nth min is: "+a[min-1]);
		sum=a[n-max]+a[min-1];
		difference=a[n-max]-a[min-1];
		System.out.println("sum is: "+sum);
		System.out.println("difference is: "+difference);
		
	}
}