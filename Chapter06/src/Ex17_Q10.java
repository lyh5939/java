import java.util.Scanner;

public class Ex17_Q10
{

	public static void main(String[] args)
	{
		//사용자로부터 5개의 정수를 입력받아서 합을 구하여 출력한다.		
		//만약 입력받는 숫자가 1미만의 숫자라면 재입력을 요구해야 한다
		//그래서 1이상의 정수 5개를 입력받아야 프로그램이 완성된다.
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int count=0;
		
		while(true)
		{ 
			
			System.out.println("정수를 입력하세요("+(count+1)+") :");
			int num = sc.nextInt();
			
			if( num < 1 )
			{
				System.out.println("1이상의 정수만 입력 가능합니다. 다시압력하세요");	
				continue;
			}
			else
			{
				sum += num;
				count++;
			}
			
			if( count == 5 )
			{
				break;
			}
		}
		
		System.out.println("=====================");
		System.out.println("정수의 합은 : "+sum);
	}

}
