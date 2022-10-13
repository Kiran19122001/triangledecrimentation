package startpattern;
public class program {
	public static void main(String[] arg) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int count=i*(i+1)/2;
			for(int j=1;j<=i;j++)
			{
				if(count<10)
				{
					System.out.print("0");
				}
				System.out.print(count--);
				if(j<=i-1)
				{
					System.out.print(" * ");
				}
			}System.out.println();
		}
		
	}
}