
class Npc
{
	
	public String name ="";
	public int  hp = 0;
	
	public void say(int n1)
	{
		System.out.println("안녕하세요 "+ n1);
	}


}


public class NpcUse
{

	public static void main(String[] args)
	{
		Npc saram1 = new Npc();
		saram1.name = "홍길동";
		saram1.hp = 100;
		System.out.println( saram1.name + " : " +saram1.hp);
		saram1.say(1000);

	}

}
