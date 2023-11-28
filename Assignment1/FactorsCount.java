import java.util.*;
class FactorsCount{
	public static void main(String args[])
	{
		int n,i,c=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :: ");
		n = s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		System.out.println("number of factors="+c);
	}
}