
public class Ex03_Variablescope
{

	public static void main(String[] args)
	{
		
		boolean myState = true;
		int num1 = 11;
		
		if(myState)
		{
			num1++;
			System.out.println(num1);
		}
		
		{
			int num2=33;
			num2++;
			System.out.println(num2);
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.println(i);
		}

	}

}
