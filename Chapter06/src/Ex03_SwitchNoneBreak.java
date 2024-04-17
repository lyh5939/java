
public class Ex03_SwitchNoneBreak
{

	public static void main(String[] args)
	{
		
		int num = 6;
		
		switch (num % 7)
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("주중");
			break;
		case 6:
		default:
			System.out.println("주말");
		}
		
		if (num % 7 >= 6)
		{
			System.out.println("주말");
		}
		else
		{
			System.out.println("주중");
		}
		
		
		
		
	

	}

}
