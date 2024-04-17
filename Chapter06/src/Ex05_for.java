import java.util.Iterator;

public class Ex05_for
{

	public static void main(String[] args)
	{
		
		for (int i=2; i <10 ; i++)
		{
			System.out.print((2 * i) + "  ");			
		}
		System.out.println();
		
		//한줄만 실행하려면 중괄호 생략가능
		for (int i=2; i <10 ; i++)
			System.out.print((3 * i) + "  ");			
		System.out.println();
		
		//같은줄에 작성가능 실행문장의 끝은 ;으로 구분
		for (int i=2; i <10 ; i++) System.out.print((4 * i) + "  ");			
		System.out.println();
		
		//의도치 않은 결과
		for (int i=2; i <10 ; i++)
			// System.out.println(i);
			System.out.print((5 * i) + "  ");			
		System.out.println();
		
		
		
		
	}

}
