
public class Ex06_ForExtension
{

	public static void main(String[] args)
	{
		int i=0 ;		
		for( ; i<10 ; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i + "");
			}
		}
		System.out.println();
		
        i=0 ;		
		for( ; i<10 ; )
		{
			if(i%2 == 0)
			{
				System.out.println(i + "");
			}
			i++;
		}
		System.out.println();
		
		for(int j=0 ; j<10 ; j=j+2 )
		{
			if(j%2 == 0)
			{
				System.out.println(j + "");
			}
			
		}
	}

}
