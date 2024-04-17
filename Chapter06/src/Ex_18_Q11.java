
public class Ex_18_Q11
{

	public static void main(String[] args)
	{
		//1부터 100까지 정수중에서 짝수의 합을 구하라.
		
		int sum = 0;
		
		for(int i=1; i <= 100; i++)
		{
			if( i % 2 == 0 )
			{
				sum += i; 
			}
		}
		
		System.out.println("1부터 100까지의 정수중 짝수의 합은 : "+sum);
	}

}
