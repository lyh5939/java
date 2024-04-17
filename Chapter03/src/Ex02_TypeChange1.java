
public class Ex02_TypeChange1
{

	public static void main(String[] args)
	{
		int num1 = 1;
		byte num2 = 1;
		byte num3 = 127;
		// byte num4 = 128;
		
		short num5 = 1;
		
		// num2 = num5;    // num5 2바이트 인데 num2는 1바이트임으로 에러
		num2 = (byte)num5;   // short num5를 byte형으로 강제 형 변환

	}

}
