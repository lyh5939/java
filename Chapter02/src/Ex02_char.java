
public class Ex02_char
{

	public static void main(String[] args)
	{
		
		char ch1 = 'A'; //2바이트 할당후 A를 인코딩해서 2진수로 저장
		char ch2 = 65;  //2바이트 할당수 65를 2진수로 저장
		char ch3 = 0x41; // 16진수를 2진수로 저장
		char ch4 = 0b0000000001000001;  // 2진수는 그냥 저장
		
		
		 // ch1의 자료형이 char형임으로 A로 디코딩해서 출력
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);

	}

}
