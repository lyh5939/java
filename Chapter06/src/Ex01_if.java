
public class Ex01_if
{

	public static void main(String[] args)
	{
	
		int num = 100;
		if (num > 50)
		{
			System.out.println("num 변수의 값이 50보다 큽니다.");
		}
		
		//한줄만 실행하면 중괄호를 생략 가능
		if(num>50)
			System.out.println("num 변수의 값이 50보다 큼");
		
		// 같은 줄에 작성 가능, 실행 문장의 끝은 ; 로 구분
		if(num>50)	System.out.println("num 변수의 값이 50보다 큼");
		
		//의도치 않은 결과
		if (num < 50)
			System.out.println(num);   //num 변수의 값이 궁금해 출력
			System.out.println("num 변수의 값이 50보다 큼");
		
		
	}

}
