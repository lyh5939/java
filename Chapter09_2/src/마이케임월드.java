
class 도사
{
	String name;
	void doAciton()
	{
		System.out.println("도술을 합니다. ");
	}
	
	void 도술()
	{
		System.out.println("비바람이 칩니다.");
	}
	void 도술(int num)
	{
		System.out.println("비바람이 칩니다. : lebel "+num);
	}
	void 도술(String locate)
	{
		System.out.println("비바람이 칩니다. : location "+locate);
	}
	
}

class 마법사
{
	String name;
	void doAciton()
	{
		System.out.println("마법을 합니다.  ");
	}
}



public class 마이케임월드
{

	public static void main(String[] args)
	{
		도사  dosa1 = new 도사();
		dosa1.name = "홍길동";
		dosa1.doAciton();
		dosa1.도술();
		
		도사  dosa2 = new 도사();
		dosa2.name = "전우치";
		dosa2.doAciton();
		
		도사  dosa3 = new 도사();
		dosa3.name = "손오공";
		dosa3.doAciton();
		
		마법사 mage1 = new 마법사();
		mage1.name = "해리포터";
		mage1.doAciton();
		
		마법사 mage2 = new 마법사();
		mage2.name = "간달프";
		mage2.doAciton();
		
	}

}












