import java.util.Scanner;

public class Ex013_q5
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int result=0;		
		
		while(true)
		{
			System.out.print("정수를 입력하세요 : ");
			int num = sc.nextInt();
			
			result +=  num;
			
			if( num == 0)
			{
			  System.out.println("-----------------------");	
			  System.out.println("입력된 정수의 합 : "+result);	
			  break;
			}
			
			
		}
	}
	
}
