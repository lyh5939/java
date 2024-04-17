
public class Ex12_q4
{
	public static void main(String[] args)
	{
		int i=1;
		int result=0;
	   	do {
	   		
	   		if( i == 1000)
	   		{
	   			System.out.print( i+ "=");
	   		}
	   		else
	   		{
	   			System.out.print( i + "+");
	   		}
	   		
	   		
	   		result=result+i;
	   		i++;
	   		
	   	}while(i<=1000);
	   	
	   	System.out.println(result);
	} 
	
}
