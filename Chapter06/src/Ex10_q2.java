import java.util.Scanner;

public class Ex10_q2
{

	public static void main(String[] args)
	{
		int count=0;
		while(count < 3)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어 점수를 입력하세요 : ");			
			int kor = sc.nextInt();
			System.out.print("영어 점수를 입력하세요 : ");
			int eng = sc.nextInt();
			System.out.print("수학 점수를 입력하세요 : ");
			int mat = sc.nextInt();
			
			System.out.println();
			
			double avg = (kor+eng+mat) / 3.0;
			
			char hacjum='F';
			
			if(avg >= 90)
			{
				hacjum = 'A';
			}
			else if(avg >= 80)
			{
				hacjum = 'B';
			}
			else if(avg >= 70)
			{
				hacjum = 'C';
			}
			else if(avg >= 50)
			{
				hacjum = 'D';
			}
			else
			{
				hacjum = 'F';
			}
			
			
			System.out.printf("국어 : %d 영어 : %d 수학 : %d 평균 : %f  학점 : %c", kor,eng,mat,avg,hacjum );
			count++;
			System.out.println();
			System.out.println("=================================================== ");
		}

	}

}
