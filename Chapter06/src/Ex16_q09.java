import java.util.Scanner;

public class Ex16_q09
{

	public static void main(String[] args)
	{
		// 사용자로부터 정수 하나를 입력받은 후 
		Scanner sc= new Scanner(System.in);
		System.out.println("단수를 입력하세요 : ");
		int num = sc.nextInt();
		
		//그 수에 해당하는 구구단을 역순으로 출력하시오
		for(int i=9; i>0 ; i--)
		{
			System.out.println( num + " x "+ i + "=" +(num*i));
		}

	}

}
