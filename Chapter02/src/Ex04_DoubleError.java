
public class Ex04_DoubleError
{

	public static void main(String[] args)
	{
		double dNum1 = 1.0000001;
		System.out.println(dNum1);
		
		double dNum2 = 1.0000003;
		System.out.println(dNum2);
		
		
		// double형은 계산시 100%정확하지 않다
		System.out.println(dNum1+dNum2);
	}

}
