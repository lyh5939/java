
public class Ex01_MethodType
{

	public static void main(String[] args)
	{
		//매개변수 없고 반환 없는 메서드
		sayHello();
		
		//메게변수 있고 반화 없는 메서드
		addTwoNum(5, 2);
		
		//매게변수 없고 반화 인ㅆ는 메서드
		int age = getAge();
		System.out.println(age);
		System.out.println(getAge());
		
		
		//매게변수 있고 반화 있는 메서드
		int sum = addTwoNum2(1,2);
		System.out.println(" 합 : "+sum);

	}
	
	public static int addTwoNum2(int num1, int num2) {
		return num1+num2;
	}
	
	
	public static int getAge() {
		return 20;
	}
	
	
	public static void addTwoNum(int num1, int num2) {
		int nResult = num1 + num2;
		System.out.println(nResult);
	}
	
	public static void sayHello() {
		System.out.println("Hello");
	}

}
