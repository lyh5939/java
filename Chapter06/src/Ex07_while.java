
public class Ex07_while
{

	public static void main(String[] args)
	{
		int num=0;
		int count = 0;
		
		
		while( (num++) < 200)
		{
			if( ( num % 5 ) != 0 || ( num % 7 ) != 0)
				 continue;
			
			if( num % 5 != 0 )
				continue;
			if( num % 7 != 0 )
				continue;
			
			count++;
			
			System.out.println(num);
		}	
		
		System.out.println("count : "+count);
		
	}

}
