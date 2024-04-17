import java.util.Scanner;

public class MyCalulator
{
	
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			// 메뉴출력
			printMenu();
			
			//메뉴 입력
			int menu = sc.nextInt();
			
			//매뉴가 1이면 종료						
			if(menu == 0 )
			{
				System.out.println("종료하셨습니다. ");
				break;
			}
			
			int num1=0;
			int num2=0;
			
			if(menu < 5 )
			{				
				//두 정수입력		
				System.out.print("첫번째 수 입력 : ");
				num1 = sc.nextInt();
				System.out.print("두번째 수 입력 : ");
				num2 = sc.nextInt();
			}
			
			
			if(menu == 1)
			{
				//더하기 함수 호출
				int add = getAdd(num1, num2);
				System.out.println("--------------------------");
				System.out.printf("%d + %d = %d",num1,num2,add);
				System.out.println();
			}
			else if( menu == 2 )
			{
				//곱하기 함수호출
				int sub = getSub(num1, num2);
				System.out.println("--------------------------");
				System.out.printf("%d - %d = %d",num1,num2,sub);
				System.out.println();
			}
			else if( menu == 3 )
			{
				//나누기 함수호출
				int mul = getMul(num1, num2);
				System.out.println("--------------------------");
				System.out.printf("%d x %d = %d",num1,num2,mul);
				System.out.println();
			}
			else if( menu == 4 )
			{
				//빼기 함수호출
				double div = getDiv(num1, num2);
				System.out.println("--------------------------");
				System.out.printf("%d / %d = %f",num1,num2,div);
				System.out.println();
			}
			else
			{
				System.out.println("없는 메뉴를 입력하셨습니다. 다시입력 하세요");
				continue;
			}
			
		}
		
		
	}
	
	public static double getDiv(int n1, int n2)
	{
		return (double)n1/n2;
	}
	
	public static int getMul(int n1, int n2)
	{
		return n1*n2;
	}
	
	public static int getSub(int n1, int n2)
	{
		return n1-n2;
	}
    
	public static int getAdd(int n1, int n2)
	{
		return n1+n2;
	}
	
	public static void printMenu()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========================");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.곱하기");
		System.out.println("4.나누기");		
		System.out.println("0.종료");
		System.out.println("========================");
		
		
	}
}
