
public class Ex04_q1
{

	public static double avg(int num1, int num2, int num3)
	{
		double aver = (num1 + num2 + num3) / 3.0;
		return aver;
	}
	
	public static int maxi(int num1, int num2, int num3)
	{
		int max = num1;
		if( num2 > max)
		{
			max = num2;
		}
		if(num3 > max)
		{
			max = num3;
		}
		return max;
				
	}
	
	public static int mini(int num1, int num2, int num3)
	{
		int min = num1;
		if( num2 < min)
		{
			min = num2;
		}
		if(num3 < min)
		{
			min = num3;
		}
		
		return min;
					
	}
	
	public static void main(String[] args)
	{
      		
		System.out.println("세수의 평균은 : " + avg(10,100,56));
		System.out.println("세수중 최대값 : " + maxi(10,50,30));
		System.out.println("세수의 평균은 : " + mini(10,50,30));
        
	}

}
