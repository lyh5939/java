
public class Ex02_switch
{

	public static void main(String[] args)
	{
		
		int num =5;
		
		switch (num % 3)
		{
		case 1:
		{
		   System.out.println("나머지가 1");	
		   break;
		}
		case 2:
		{
		   System.out.println("나머지가 2");	
		   break;
		}
		default:
			System.out.println("나머지가 0");
		}
		
		int namugi = num % 3;
		
		if (namugi % 3 == 1)
		{
			 System.out.println("나머지가 1");	
		}
		else if (namugi % 3 == 2)
		{
			System.out.println("나머지가 2");
		}
		else
		{
			System.out.println("나머지가 0");
		}
		
		
	}

}
