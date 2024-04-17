class 소방차
{
	String name;
	
	void doAction()
	{
		System.out.println("물을 뿌려서 불을 끕니다.");
	}
}

class 경찰차
{
	String name;
	
	void doAction()
	{
		System.out.println("열심히 달려가서 범인을 잡습니다..");
	}
}

class 승용차
{
    String name;
	
	void doAction()
	{
		System.out.println("차를 타고 출퇴근을 합니다. ");
	}
}


public class Starcreft
{

	public static void main(String[] args)
	{
		소방차 car1 = new 소방차();
		소방차 car2 = new 소방차();
		경찰차 car3 = new 경찰차();
		승용차 car4 = new 승용차();
	}

}
