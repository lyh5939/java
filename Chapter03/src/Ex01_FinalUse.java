
public class Ex01_FinalUse
{

	public static void main(String[] args)
	{
		final int MAX_NUM = 100;  //선언과 동시에 초기화
		final int MIN_NUM;        //선언만
		
		MIN_NUM = 60;      // 한번은 변경(초기화)가능		
		
		int myScore = 40 ;
		if(myScore < MIN_NUM)
		{
			System.out.println("당신의 등급은 F입니다. ");
		}

	}

}
